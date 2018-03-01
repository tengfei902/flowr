package com.flowr.core.support;

import com.flowr.common.exceptions.AdBizException;
import com.flowr.core.support.handlers.BeanRegistryInvocationHandler;

import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonBeanRegistry implements BeanRegistry,SingletonBeanFactory {

    private static final Map<String,Object> beanSingletons = new ConcurrentHashMap<>();

    @Override
    public void register(String beanName, boolean isSingleton) {

    }

    @Override
    public void register(Class beanType) {
        String key = beanType.getSimpleName();
        if(Objects.isNull(beanSingletons.get(key))) {
            synchronized (beanSingletons) {
                Object instance = null;
                try {
                    instance = beanType.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if(instance == null) {
                    instance = Proxy.newProxyInstance(beanType.getClassLoader(),beanType.getInterfaces(),new BeanRegistryInvocationHandler());
                }

                beanSingletons.put(key,instance);
            }
        }
    }

    @Override
    public <T> T getSingleton(Class<T> dataType) {
        Object obj = beanSingletons.get(dataType.getSimpleName());
        if(obj == null) {
            register(dataType);
            obj = beanSingletons.get(dataType.getSimpleName());
            if(obj == null) {
                throw new AdBizException(String.format("%s cannot be initialized",dataType.getName()));
            }
        }
        return (T)obj;
    }

    @Override
    public Object getSingleton(String bean) {
        return null;
    }
}

package com.flowr.core.support;

public class DefaultBeanFactory extends SingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String clazz) {
        return null;
    }

    @Override
    public <T> T getBean(String clazz, Class<T> type) {
        return null;
    }

    private <T> Object doGetBean(Class<T> type) {
        return getSingleton(type);
    }

    @Override
    public <T> T getBean(Class<T> type) {
        return getSingleton(type);
    }
}

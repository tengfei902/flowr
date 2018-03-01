package com.flowr.core.support.handlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BeanRegistryInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(proxy,args);
        return result;
    }
}

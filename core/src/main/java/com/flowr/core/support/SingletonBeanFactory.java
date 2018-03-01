package com.flowr.core.support;

public interface SingletonBeanFactory {
    <T> T getSingleton(Class<T> dataType);
    Object getSingleton(String bean);
}

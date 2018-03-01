package com.flowr.core.support;

public interface BeanFactory {
    Object getBean(String clazz);
    <T> T getBean(String clazz,Class<T> type);
    <T> T getBean(Class<T> type);
}

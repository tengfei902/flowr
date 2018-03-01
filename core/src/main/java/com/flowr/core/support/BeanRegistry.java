package com.flowr.core.support;

public interface BeanRegistry {
    void register(String beanName,boolean isSingleton);
    void register(Class beanType);
}

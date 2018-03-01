package com.flowr;

import com.flowr.core.flow.FlowPool;
import com.flowr.core.support.BeanFactory;
import com.flowr.core.support.BeanRegistry;
import com.flowr.core.support.DefaultBeanFactory;
import com.flowr.core.support.SingletonBeanRegistry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    @Test
    public void testRegister() {
        BeanRegistry singletonBeanRegistry = new SingletonBeanRegistry();
        singletonBeanRegistry.register(FlowPool.class);

        BeanFactory beanFactory = new DefaultBeanFactory();
        FlowPool flowPool = beanFactory.getBean(FlowPool.class);
        Assert.assertNotNull(flowPool);
    }
}

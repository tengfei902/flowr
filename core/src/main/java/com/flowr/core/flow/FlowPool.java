package com.flowr.core.flow;

import com.flowr.common.model.IdToken;
import com.flowr.core.support.ObjectFactory;

public class FlowPool implements ObjectFactory {

    private String namespace;

    public FlowPool addNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdFlow getAdFlow(IdToken idToken) {
        return null;
    }

    @Override
    public void init(Object... objs) {

    }
}

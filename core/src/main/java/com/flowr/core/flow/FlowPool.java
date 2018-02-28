package com.flowr.core.flow;

import com.flowr.common.model.IdToken;

public interface FlowPool {
    AdFlow getAdFlow(IdToken idToken);
}

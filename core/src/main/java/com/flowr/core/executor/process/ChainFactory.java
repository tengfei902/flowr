package com.flowr.core.executor.process;

import com.flowr.common.model.IdToken;

public interface ChainFactory {
    ProcessChain getInvokeChain(IdToken idToken);
}

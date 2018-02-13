package com.flowr.biz.executor.processors;

import com.flowr.model.ad.IdToken;

public interface ChainFactory {
    ProcessChain getInvokeChain(IdToken idToken);
}

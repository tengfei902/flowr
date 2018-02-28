package com.flowr.core.executor;

import com.flowr.common.model.AdRequest;
import com.flowr.common.model.AdResponse;
import com.flowr.core.executor.process.ChainFactory;

public class DefaultExecutor implements Executor {
    private ChainFactory chainFactory;

    @Override
    public AdResponse execute(AdRequest adRequest) {
        return chainFactory.getInvokeChain(adRequest.getIdToken()).invoke(adRequest);
    }
}

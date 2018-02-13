package com.flowr.biz.executor;

import com.flowr.biz.executor.processors.ChainFactory;
import com.flowr.model.ad.AdRequest;
import com.flowr.model.ad.AdResponse;

public class DefaultExecutor implements Executor {
    private ChainFactory chainFactory;

    @Override
    public AdResponse execute(AdRequest adRequest) {
        return chainFactory.getInvokeChain(adRequest.getIdToken()).invoke(adRequest);
    }
}

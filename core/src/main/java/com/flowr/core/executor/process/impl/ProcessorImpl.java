package com.flowr.core.executor.process.impl;

import com.flowr.common.model.AdRequest;
import com.flowr.core.executor.handlers.Handler;
import com.flowr.core.executor.process.Processor;

public class ProcessorImpl implements Processor {

    @Override
    public void process(AdRequest adRequest) {
        getHandler().handle(adRequest);
    }

    @Override
    public Handler getHandler() {
        return null;
    }

    @Override
    public String getNo() {
        return null;
    }
}

package com.flowr.biz.executor.processors;

import com.flowr.biz.executor.handlers.Handler;
import com.flowr.model.ad.AdRequest;

import java.util.List;

public class ProcessorImpl implements Processor {

    @Override
    public void process(AdRequest adRequest) {
        getHandler().handle(adRequest);
    }

    @Override
    public List<Processor> getSubProcessors() {
        return null;
    }

    @Override
    public Handler getHandler() {
        return null;
    }
}

package com.flowr.biz.executor.processors;

import com.flowr.biz.executor.handlers.Handler;
import com.flowr.model.ad.AdRequest;

import java.util.List;

public interface Processor {
    Handler getHandler();
    void process(AdRequest adRequest);
    List<Processor> getSubProcessors();
}

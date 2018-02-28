package com.flowr.core.executor.process;

import com.flowr.common.model.AdRequest;
import com.flowr.core.executor.handlers.Handler;

public interface Processor {
    String getNo();
    Handler getHandler();
    void process(AdRequest adRequest);
}

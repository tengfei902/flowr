package com.flowr.core.executor.process;

import com.flowr.common.model.AdRequest;
import com.flowr.common.model.AdResponse;

public interface ProcessChain {
    boolean hasNext();
    int getLength();
    Processor next();
    AdResponse invoke(AdRequest adRequest);
}

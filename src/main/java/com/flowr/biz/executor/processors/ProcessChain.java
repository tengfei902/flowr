package com.flowr.biz.executor.processors;

import com.flowr.model.ad.AdRequest;
import com.flowr.model.ad.AdResponse;

public interface ProcessChain {
    boolean hasNext();
    int getLength();
    Processor next();
    AdResponse invoke(AdRequest adRequest);
}

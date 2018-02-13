package com.flowr.biz.executor;

import com.flowr.model.ad.AdRequest;
import com.flowr.model.ad.AdResponse;

public interface Executor {
    AdResponse execute(AdRequest adRequest);
}

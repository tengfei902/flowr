package com.flowr.core.executor;

import com.flowr.common.model.AdRequest;
import com.flowr.common.model.AdResponse;

public interface Executor {
    AdResponse execute(AdRequest adRequest);
}

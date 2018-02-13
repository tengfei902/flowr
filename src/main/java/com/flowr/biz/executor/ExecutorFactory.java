package com.flowr.biz.executor;

import com.flowr.model.ad.IdToken;

public interface ExecutorFactory {
    Executor getExecutor(IdToken key);
}
package com.flowr.core.executor;

import com.flowr.common.model.IdToken;

public interface ExecutorFactory {
    Executor getExecutor(IdToken key);
}
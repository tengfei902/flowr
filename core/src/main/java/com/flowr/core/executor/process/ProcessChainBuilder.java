package com.flowr.core.executor.process;

import com.flowr.common.model.Module;

import java.util.List;

public interface ProcessChainBuilder {
    ProcessChainBuilder add(Module module);
    ProcessChainBuilder add(List<Module> modules);
    ProcessChain build();
}

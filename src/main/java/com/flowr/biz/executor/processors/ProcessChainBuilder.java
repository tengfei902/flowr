package com.flowr.biz.executor.processors;

public interface ProcessChainBuilder {
    ProcessChainBuilder add(Processor processor);
    ProcessChain build();
}

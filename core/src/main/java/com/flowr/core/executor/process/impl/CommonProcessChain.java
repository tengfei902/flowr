package com.flowr.core.executor.process.impl;

import com.flowr.common.model.AdRequest;
import com.flowr.common.model.AdResponse;
import com.flowr.core.executor.process.ProcessChain;
import com.flowr.core.executor.process.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CommonProcessChain implements ProcessChain {

    private List<Processor> processors;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public Processor next() {
        return null;
    }

    public void addProcessor(Processor processor) {
        if(Objects.isNull(processors)) processors = new ArrayList<>();
        processors.add(processor);
    }

    @Override
    public AdResponse invoke(AdRequest adRequest) {
        processors.stream().forEach(processor -> processor.process(adRequest));
        return null;
    }
}

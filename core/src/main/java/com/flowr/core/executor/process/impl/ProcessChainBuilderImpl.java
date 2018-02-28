package com.flowr.core.executor.process.impl;

import com.flowr.common.model.Module;
import com.flowr.core.executor.process.ProcessChain;
import com.flowr.core.executor.process.ProcessChainBuilder;
import com.flowr.core.executor.process.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcessChainBuilderImpl implements ProcessChainBuilder {
    private List<Module> modules;

    @Override
    public ProcessChainBuilder add(Module module) {
        if(Objects.isNull(modules)) modules = new ArrayList<>();
        modules.add(module);
        return this;
    }

    @Override
    public ProcessChainBuilder add(List<Module> modules) {
        if (Objects.isNull(this.modules)) this.modules = new ArrayList<>();
        this.modules.addAll(modules);
        return this;
    }

    @Override
    public ProcessChain build() {
        Module startModule = findStartModule(modules);
        Module endModule = findEndModule(modules);

        List<Processor> processors = new ArrayList<>();
        modules.forEach(module -> processors.add(createProceesorFromModule(module)));

        Map<String,Processor> processorMap = processors.stream().collect(Collectors.toMap(Processor::getNo, Function.identity()));

        CommonProcessChain processChain = new CommonProcessChain();

        Processor startProcessor = processorMap.get(startModule.getNo());
        processChain.addProcessor(startProcessor);

        return processChain;

    }

    private Module findStartModule(List<Module> modules) {
        return modules.parallelStream().filter(Module::isStart).collect(Collectors.toList()).get(0);
    }

    private Module findEndModule(List<Module> modules) {
        return modules.parallelStream().filter(Module::isEnd).collect(Collectors.toList()).get(0);
    }

    private Processor createProceesorFromModule(Module module) {
        Processor processor = new ProcessorImpl();
        return processor;
    }
}

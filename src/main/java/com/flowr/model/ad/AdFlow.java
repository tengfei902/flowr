package com.flowr.model.ad;

import com.flowr.biz.adapter.RequestAdapter;
import com.flowr.biz.adapter.ResponseAdapter;
import com.flowr.biz.executor.Executor;

public class AdFlow {
    private int slotId;
    private String bizName;
    private RequestAdapter requestRequestAdapter;
    private Executor strategyExecutor;
    private ResponseAdapter responseAdapter;

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public RequestAdapter getRequestRequestAdapter() {
        return requestRequestAdapter;
    }

    public void setRequestRequestAdapter(RequestAdapter requestRequestAdapter) {
        this.requestRequestAdapter = requestRequestAdapter;
    }

    public Executor getStrategyExecutor() {
        return strategyExecutor;
    }

    public void setStrategyExecutor(Executor strategyExecutor) {
        this.strategyExecutor = strategyExecutor;
    }

    public ResponseAdapter getResponseAdapter() {
        return responseAdapter;
    }

    public void setResponseAdapter(ResponseAdapter responseAdapter) {
        this.responseAdapter = responseAdapter;
    }
}

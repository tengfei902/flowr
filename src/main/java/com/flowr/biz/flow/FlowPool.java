package com.flowr.biz.flow;

import com.flowr.model.ad.AdFlow;
import com.flowr.model.ad.IdToken;

public interface FlowPool {
    AdFlow getFlow(IdToken key);
}
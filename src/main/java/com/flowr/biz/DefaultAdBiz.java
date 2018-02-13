package com.flowr.biz;

import com.flowr.biz.flow.FlowPool;
import com.flowr.biz.flow.IdBuilder;
import com.flowr.model.ad.AdFlow;
import com.flowr.model.ad.AdRequest;
import com.flowr.model.ad.AdResponse;
import com.flowr.model.ad.IdToken;
import com.flowr.utils.ResponseConvertor;

import java.util.Map;

public class DefaultAdBiz implements AdBiz {

    private FlowPool flowPool;
    private IdBuilder idBuilder;

    @Override
    public AdResponse searchAd(Map<String,Object> map) {
        IdToken idToken = idBuilder.getId(map);

        AdFlow adFlow = flowPool.getFlow(idToken);

        AdRequest adRequest = adFlow.getRequestRequestAdapter().adapt(map);
        AdResponse adResponse = adFlow.getStrategyExecutor().execute(adRequest);
        Map<String,Object> resultMap = adFlow.getResponseAdapter().adapt(adResponse);

        return ResponseConvertor.convert(resultMap);
    }
}

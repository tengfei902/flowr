package com.flowr.client;

import com.flowr.common.model.AdResponse;
import com.flowr.common.model.IdToken;

import java.util.Map;

public class AdBizImpl implements AdBiz {

    private String env;
    private String hostname;
    private int port;
    private String serviceKey;
    private String appkey;

    @Override
    public void init() {

    }

    @Override
    public AdResponse searchAd(Map<String, Object> map, IdToken idToken) {
        return null;
    }
}

package com.flowr.client;

import com.flowr.common.model.AdResponse;
import com.flowr.common.model.IdToken;

import java.util.Map;

public interface AdBiz {
    void init();
    AdResponse searchAd(Map<String,Object> map,IdToken idToken);
}

package com.flowr.biz;

import com.flowr.model.ad.AdResponse;

import java.util.Map;

public interface AdBiz {
    AdResponse searchAd(Map<String,Object> map);
}

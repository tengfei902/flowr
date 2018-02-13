package com.flowr.biz.adapter;

import com.flowr.model.ad.AdResponse;

import java.util.Map;

public interface ResponseAdapter {
    Map<String,Object> adapt(AdResponse adResponse);
}

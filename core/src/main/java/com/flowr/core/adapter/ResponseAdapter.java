package com.flowr.core.adapter;

import com.flowr.common.model.AdResponse;

import java.util.Map;

public interface ResponseAdapter {
    Map<String,Object> adapt(AdResponse adResponse);
}

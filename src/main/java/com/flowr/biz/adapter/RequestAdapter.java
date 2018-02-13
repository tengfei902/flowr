package com.flowr.biz.adapter;

import com.flowr.model.ad.AdRequest;

import java.util.Map;

public interface RequestAdapter {
    AdRequest adapt(Map<String,Object> map);
}

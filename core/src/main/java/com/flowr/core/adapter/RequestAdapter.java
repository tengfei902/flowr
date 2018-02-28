package com.flowr.core.adapter;

import com.flowr.common.model.AdRequest;

import java.util.Map;

public interface RequestAdapter {
    AdRequest adapt(Map<String,Object> map);
}

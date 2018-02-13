package com.flowr.model.ad;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.TreeMap;

public class IdToken {
    private Map<String,String> idMap;

    public IdToken addKeyParam(String k,String v) {
        if(MapUtils.isEmpty(idMap)) {
            idMap = new TreeMap<>();
        }
        if(StringUtils.isEmpty(v)) {
            return this;
        }
        idMap.put(k,v);
        return this;
    }
}

package com.flowr.common.model;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class AdRequest {
    private String requestId;
    private IdToken idToken;
    private Map<String,Object> infoMap;

    public String getRequestId() {
        return requestId;
    }

    public IdToken getIdToken() {
        return idToken;
    }

    public Map<String, Object> getInfoMap() {
        return infoMap;
    }

    public void addInfo(String key,Object val) {
        if(Objects.isNull(infoMap)) {
            infoMap = new ConcurrentHashMap<>();
        }
        infoMap.put(key,val);
    }
}

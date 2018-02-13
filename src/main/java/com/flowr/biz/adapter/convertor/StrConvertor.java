package com.flowr.biz.adapter.convertor;

import java.util.HashMap;
import java.util.Map;

public class StrConvertor implements Convertor {

    private Map<String,String> strMap = new HashMap<>();

    @Override
    public String convert(String key) {
        return strMap.get(key);
    }
}

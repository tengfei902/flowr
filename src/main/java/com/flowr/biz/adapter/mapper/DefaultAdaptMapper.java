package com.flowr.biz.adapter.mapper;

import com.flowr.biz.adapter.convertor.Convertor;
import com.flowr.biz.adapter.convertor.ConvertorFactory;
import com.flowr.model.ad.IdToken;

public class DefaultAdaptMapper implements AdaptMapper {

    private ConvertorFactory convertorFactory;

    @Override
    public String[] map(IdToken idToken, String key, String value) {
        Convertor convertor = convertorFactory.getConvertor(idToken,key);
        String targetKey = convertor.convertKey();
        String targetVal = convertor.convertValue(value);
        return new String[]{targetKey,targetVal};
    }
}
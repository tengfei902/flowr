package com.flowr.core.adapter.mapper;

import com.flowr.common.model.IdToken;
import com.flowr.core.adapter.convertor.Convertor;
import com.flowr.core.adapter.convertor.ConvertorFactory;

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
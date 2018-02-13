package com.flowr.biz.adapter.convertor;

import com.flowr.model.ad.IdToken;

public interface ConvertorFactory {
    Convertor getConvertor(IdToken idToken,String key);
}

package com.flowr.core.adapter.convertor;

import com.flowr.common.model.IdToken;

public interface ConvertorFactory {
    Convertor getConvertor(IdToken idToken, String key);
}

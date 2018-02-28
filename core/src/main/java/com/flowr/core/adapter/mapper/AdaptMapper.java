package com.flowr.core.adapter.mapper;

import com.flowr.common.model.IdToken;

public interface AdaptMapper {
    String[] map(IdToken idToken, String key, String value);
}

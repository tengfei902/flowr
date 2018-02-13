package com.flowr.biz.adapter.mapper;

import com.flowr.model.ad.IdToken;

public interface AdaptMapper {
    String[] map(IdToken idToken, String key, String value);
}

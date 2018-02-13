package com.flowr.biz.adapter.mapper;

import com.flowr.model.ad.IdToken;

public interface AdaptMapperFactory {
    AdaptMapper getAdaptMapper(IdToken key);
}

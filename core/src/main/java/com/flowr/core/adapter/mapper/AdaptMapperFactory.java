package com.flowr.core.adapter.mapper;

import com.flowr.common.model.IdToken;

public interface AdaptMapperFactory {
    AdaptMapper getAdaptMapper(IdToken key);
}

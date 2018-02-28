package com.flowr.core.flow;

import com.flowr.common.model.IdToken;

import java.util.Map;

public interface IdBuilder {
    IdToken getId(Map<String,Object> map);
}

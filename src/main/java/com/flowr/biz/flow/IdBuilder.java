package com.flowr.biz.flow;

import com.flowr.model.ad.IdToken;

import java.util.Map;

public interface IdBuilder {
    IdToken getId(Map<String,Object> map);
}

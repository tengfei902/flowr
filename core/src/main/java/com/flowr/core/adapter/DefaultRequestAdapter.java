package com.flowr.core.adapter;

import com.flowr.common.model.AdRequest;
import com.flowr.common.model.IdToken;
import com.flowr.core.adapter.mapper.AdaptMapper;
import com.flowr.core.adapter.mapper.AdaptMapperFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultRequestAdapter implements RequestAdapter {

    private IdToken idToken;
    private AdaptMapperFactory adaptMapperFactory;

    @Override
    public AdRequest adapt(Map<String, Object> map) {
        AdRequest adRequest = new AdRequest();

        Map<String,Object> resultMap = new ConcurrentHashMap<>();
        AdaptMapper adaptMapper = adaptMapperFactory.getAdaptMapper(idToken);

        map.keySet().parallelStream().forEach(s -> {
            String[] targets = adaptMapper.map(idToken,s,String.valueOf(map.get(s)));
            adRequest.addInfo(targets[0],targets[1]);
        });

        return adRequest;
    }
}

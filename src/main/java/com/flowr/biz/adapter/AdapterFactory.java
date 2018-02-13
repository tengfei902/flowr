package com.flowr.biz.adapter;

import com.flowr.model.ad.IdToken;

public interface AdapterFactory {
    RequestAdapter getAdapter(IdToken key);
}

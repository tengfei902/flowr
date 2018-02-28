package com.flowr.core.adapter;

import com.flowr.common.model.IdToken;

public interface AdapterFactory {
    RequestAdapter getAdapter(IdToken key);
}

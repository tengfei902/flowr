package com.flowr.biz.adapter.convertor;

public interface Convertor {
    String convertKey();
    String convertValue(String originValue);

    enum ConvertorType {
        STR,EXPRESSION,FUNCTION
    }

    default void init() {

    }
}

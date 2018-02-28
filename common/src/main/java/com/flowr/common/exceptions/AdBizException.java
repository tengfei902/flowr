package com.flowr.common.exceptions;

public class AdBizException extends RuntimeException {
    public AdBizException() {
        super();
    }

    public AdBizException(String message) {
        super(message);
    }

    public AdBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public AdBizException(Throwable cause) {
        super(cause);
    }

    protected AdBizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

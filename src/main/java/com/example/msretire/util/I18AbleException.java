package com.example.msretire.util;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class I18AbleException extends RuntimeException{

    protected final transient Object[] params;

    public I18AbleException(String key, Object... args) {
        super(key);
        params = args;
    }
}
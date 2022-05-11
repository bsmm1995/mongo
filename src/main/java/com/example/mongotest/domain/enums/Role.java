package com.example.mongotest.domain.enums;

public enum Role {

    ADMINISTRATOR("ADMINISTRATOR", 1),
    ANALYST("ANALYST", 2),
    USER("USER", 3);

    private final String value;
    private final int code;

    Role(String value, int code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return this.value;
    }

    public int getCode() {
        return this.code;
    }
}

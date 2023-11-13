package com.learn.app.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PrimaryKeyUtil {

    public static String getUniquePrimaryKey() {
        return UUID.randomUUID().toString();
    }
}

package com.test.lesson20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

    @Retention (RetentionPolicy.RUNTIME)
    @Target (ElementType.TYPE)
    public @interface Reflectable {
        String name();
        String value();
    }




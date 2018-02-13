package com.flowr.model.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Handler {
    String name();
    String desc() default "";
    String pack() default "";
    Step step();

    enum Step {
        request,search,response;
    }
}

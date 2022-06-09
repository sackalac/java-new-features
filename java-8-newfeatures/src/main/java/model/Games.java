package model;

import intefaceall.Game;

import java.lang.annotation.*;

// Declaring container for repeatable annotation type
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Games {
    Game[] value();

}



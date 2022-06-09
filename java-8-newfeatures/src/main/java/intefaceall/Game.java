package intefaceall;

import model.Games;

import java.lang.annotation.Repeatable;

// Declaring repeatable annotation type
@Repeatable(Games.class)
public @interface  Game{
    String name();
    String day();

}



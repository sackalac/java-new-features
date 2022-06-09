package java8;

import intefaceall.Game;
import model.Games;
import org.junit.Test;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Game(name = "Cricket",  day = "Sunday")
@Game(name = "Hockey",   day = "Friday")
@Game(name = "Football", day = "Saturday")
public class TypeAndRepeatingAnnotationsTest {

    @Test
    public void testAnnotation() {
        // Getting annotation by type into an array
        Game[] game = TypeAndRepeatingAnnotationsTest.class.getAnnotationsByType(Game.class);
        for (Game game2 : game) {    // Iterating values
            System.out.println(game2.name()+" on "+game2.day());
        }
    }
}


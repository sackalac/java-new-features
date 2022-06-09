package features;

public class JEP409 {

    public sealed interface Shape permits Rectangle, Circle, Square, Triangle {
        int getNumberOfSides();
    }

    public static final class Rectangle implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }

    public static final class Circle implements Shape {
        @Override
        public int getNumberOfSides() {
            return 0;
        }
    }

    public static final class Square implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }

    public static non-sealed class Triangle implements Shape {

        @Override
        public int getNumberOfSides() {
            return 3;
        }
    }

}

package patternmatchingforinstanceof;

public class PatternMatchingForInstanceOf {

    public void performAnimalOperations(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = new Cat();
            cat.meow();
        } else if(animal instanceof Dog) {
            Dog dog = new Dog();
            dog.woof();
        }
    }

    abstract class Animal {
    }

    public final class Cat extends Animal {
        public void meow() {
        }
    }

    public final class Dog extends Animal {
        public void woof() {
        }
    }

}

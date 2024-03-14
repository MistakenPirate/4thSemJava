package Inheritance;

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador's color is brown...");
    }
}

// Interface 1
interface Swim {
    void swim();
}

// Interface 2
interface Climb {
    void climb();
}

// Class implementing multiple interfaces
class Amphibian implements Swim, Climb {
    public void swim() {
        System.out.println("Amphibian is swimming...");
    }

    public void climb() {
        System.out.println("Amphibian is climbing...");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat(); // inherited method from Animal class
        dog.bark(); // own method in Dog class

        // Multilevel Inheritance
        Labrador labrador = new Labrador();
        labrador.eat(); // inherited method from Animal class
        labrador.bark(); // inherited method from Dog class
        labrador.color(); // own method in Labrador class

        // Hierarchical Inheritance - Cat and Dog simultaneously inherit from Animal
        Cat cat = new Cat();
        cat.eat(); // inherited method from Animal class
        cat.meow(); // own method in Cat class

        // Multiple Inheritance via Interfaces
        Amphibian amphibian = new Amphibian();
        amphibian.swim(); // method from Swim interface
        amphibian.climb(); // method from Climb interface
    }
}

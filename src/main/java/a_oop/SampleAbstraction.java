package a_oop;

public class SampleAbstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Animal myDog = new Dog(); // create Dog object
        myDog.animalSound();
        myDog.sleep();
    }
}

interface printdata{
     int k =10;
     void print();
     //protected int k =10; --ERROR
     //private int k =10; --- ERROR

}


abstract class Animal {

    // Abstract method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bhow bhow");
    }
}
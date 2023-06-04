package sem1.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal animal1 = new Dog();
        Animal dog = new Dog();
        animal.voice();
        cat.voice();
        animal1.voice();
        dog.voice();
    }
}

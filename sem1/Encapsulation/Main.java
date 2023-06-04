package sem1.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik", 4);
        System.out.println(cat.getName());
        cat.setName(null);
        cat.setName("barsik2");

        System.out.println(cat);

    }
}

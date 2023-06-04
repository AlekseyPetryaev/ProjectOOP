package sem1.Polymorphism;
public class Cat extends Animal{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            System.out.println("name is null");
        }else {
            this.name = name;
        }

    }

    @Override
    public void voice() {
        System.out.println("im a cat");
    }

    public int setAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age + 
                '}';
    }
}

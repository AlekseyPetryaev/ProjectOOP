package sem2.task2;

public class Teacher extends Human implements PlaceOfLiving {
    private String city;
    @Override
    public void tellInfo() {
        System.out.println("Привет! Меня зовут " + name + " " + lastName + " Мне " + age + " И я учитель ");
    }

    public Teacher(String name, String lastName, int age, String city) {
        super(name, lastName, age);
        this.city = city;
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }

}

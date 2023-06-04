package sem1.Paren;

import Java.util.ArrayList
import test.testsecond.TestClass;

public class BadPerent extends Parent{
    ArrayList<String> strings = new ArrayList<>();
    @Override
    public void say() {
        System.out.println("Я всегда ругаюсь!");
        strings.add("adadj");
    }
}

package sem2.task1;

import java.util.ArrayList;
import java.util.List;

public class Arr {
    private String name;

    private List<String> array = new ArrayList<>();
    public void howMuch() {
        System.out.println(array.size());
    }

    public List<String> getArray() {
        return array;
    }

    public void setArray(List<String> array) {
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }
}

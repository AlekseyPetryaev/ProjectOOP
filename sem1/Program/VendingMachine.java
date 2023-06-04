package sem1.Program;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    private LinkedList<product> products;

    public VendingMachine() {
        this.products = new LinkedList<>();
    }

    public void putProduct(LinkedList<product> item) {
        this.products = item;
    }

    public product geProduct() {
        return this.products.getLast();
    }
    
    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
    
}

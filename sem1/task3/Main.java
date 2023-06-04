package sem1.task3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        WaterVendingMashine wvm = new WaterVendingMashine();

        Product bonAqua = new Water("bouAqua", 50);
        Product redKey = new Water("redKey", 60);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);

        wvm.putProduct(l);
        
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

    }
}

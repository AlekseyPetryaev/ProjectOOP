package HW.DZ1;

import java.util.LinkedList;

import sem1.task3.Product;
import sem1.task3.VendingMachine;

public class HotDrink extends AllDrink implements VendingMachine {
    
    protected String drink;
    protected int volume;
    protected int temperature;
    protected int price;

    public HotDrink(String drink, int volume, int temperature) {
        this.drink = drink;
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(String drink, int price, int volume, int temperature) {
        this.drink = drink;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String getHotDrinks() {
        return drink;
    }


    public String getDrink() {
        return drink;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Напиток " + drink + ", цена " + price + ", объем " + volume + " ml," +
                " температура " + temperature + ".";
    }

    @Override
    public void putProduct(LinkedList<Product> item) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putProduct'");
    }

    @Override
    public Product getProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduct'");
    }
}
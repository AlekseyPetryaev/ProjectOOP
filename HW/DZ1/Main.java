package HW.DZ1;

public class Main {
    
    public static void main(String[] args) {
        

        HotDrink blackTea = new HotDrink("Black tea", 100, 300, 40);
        HotDrink greenTea = new HotDrink("Green tea", 150, 400, 80);
        HotDrink hotBlackTea = new HotDrink("Black tea", 150, 400, 90);
        HotDrink aqua = new HotDrink("Aqua", 80, 100, 10);
        HotDrink coffee = new HotDrink("Coffee", 300, 90);

        System.out.println(blackTea);
        System.out.println(greenTea);
        System.out.println(hotBlackTea);
        System.out.println(aqua);
        System.out.println(coffee);
    }
}
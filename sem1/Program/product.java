/*Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы 
initProducts (List <Product>) сохроняющий в себе список исходного продуктов и getProduct (String name)*/
package sem1.Program;

public class product {

    private String name;
    private int price;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
}

package HW.DZ1_1;

import java.math.BigDecimal;

public class HotDrinks {
    /**
 * Класс горячих напитков
 */
public class HotDrinks extends Drinkable {
    private int temp;

    /**
     * Перегруженный конструктор класса горячих напитков
     *
     * @param name   Наименование напитка
     * @param price  Цена напитка
     * @param volume Объем напитка
     * @param temp   Температура напитка
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    /**
     * Получение температуры напитка
     *
     * @return температуру напитка
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}

    public HotDrinks(String string, BigDecimal bigDecimal, double d, int i) {
    }

    public int getTemp() {
        return 0;
    }

    public BigDecimal getPrice() {
        return null;
    }
}
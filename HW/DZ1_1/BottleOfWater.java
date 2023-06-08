package HW.DZ1_1;

import java.math.BigDecimal;

import HW.DZ1_1.Drinkbles.Drinkable;

/**
 * Класс бутилированных напитков
 */
public class BottleOfWater extends Drinkable {
    /**
     * Перегруженный конструктор класса Бутилированных напитков
     *
     * @param name   Наименование напитка
     * @param price  Стоимость напитка
     * @param volume Объем напитка
     */
    public BottleOfWater(String name, BigDecimal price, Double volume) {
        super(name, price, volume);
    }

    public Object getName() {
        return null;
    }
}

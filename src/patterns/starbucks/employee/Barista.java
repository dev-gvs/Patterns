package patterns.starbucks.employee;

import patterns.starbucks.data.Coffee;
import patterns.starbucks.data.Muffin;

public class Barista {

    public void makeCoffee(Coffee coffee) {
        System.out.println("Бариста сделал " + coffee);
    }

    public void bakeMuffin(Muffin muffin) {
        System.out.println("Бариста испек " + muffin);
    }
}

package patterns.starbucks.data;

import patterns.starbucks.employee.Barista;

public class Order implements Command {

    private final Barista barista;
    private final Product productToMake;

    public Order(Barista barista, Product productToMake) {
        this.barista = barista;
        this.productToMake = productToMake;
    }

    @Override
    public void execute() {
        if (this.productToMake instanceof Coffee) {
            barista.makeCoffee((Coffee) productToMake);
        } else {
            barista.bakeMuffin((Muffin) productToMake);
        }
    }

    @Override
    public String toString() {
        return "Заказ{" + productToMake + '}';
    }
}

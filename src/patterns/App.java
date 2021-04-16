package patterns;

import patterns.starbucks.Starbucks;
import patterns.starbucks.data.Coffee;
import patterns.starbucks.data.CoffeeType;
import patterns.starbucks.data.Muffin;

public class App {

    private static final String CLIENT_NAME_1 = "Алексей";
    private static final String CLIENT_NAME_2 = "Виктория";

    public static void main(String[] args) {

        // Используем паттерн Singleton:
        Starbucks coffeehouse = Starbucks.getInstance();

        System.out.println("\n" + CLIENT_NAME_1 + " делает заказ...");

        // Используем паттерн Builder:
        Coffee coffee = new Coffee.Builder(CLIENT_NAME_1)
                .withSugar(true)
                .withMilk(true)
                .coffeeType(CoffeeType.LATTE)
                .build();

        // Используем паттерн Command:
        coffeehouse.newOrder(coffee);

        System.out.println("\n" + CLIENT_NAME_2 + " делает заказ...");
        coffeehouse.newOrder(new Muffin.Builder(CLIENT_NAME_2)
                .withBanana(true)
                .build());
    }
}

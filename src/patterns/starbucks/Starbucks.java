package patterns.starbucks;

import patterns.starbucks.data.Order;
import patterns.starbucks.data.Product;
import patterns.starbucks.employee.Barista;
import patterns.starbucks.employee.Waiter;

public class Starbucks {

    private static Starbucks instance = null;

    private final Barista barista;
    private final Waiter waiter;

    // Приватный конструктор: инстанцирование разрешено только внурти этого класса.
    private Starbucks() {
        this.barista = new Barista();
        this.waiter = new Waiter();
    }

    public void newOrder(Product product) {
        // Command - behavioral pattern (паттерны для взаимодействия классов).
        //
        // Создается конкретная комманда (Order), реализующая интерфейс Command,
        // которая просит получателя (Barista) совершить действие и отправляется
        // вызывающему (Waiter). Вызывающий - тот, кто знает когда дать эту
        // команду. Получатель - тот, кто знает что делать, когда дается 
        // конкретная команда.
        //
        // Таким образом, когда выполняется метод execute вызывающего, он,
        // в свою очередь, вызывает метод получателя, тем самым выполняя необходимые действия.
        Order order = new Order(barista, product);
        waiter.execute(order);
    }

    // Singleton - creational pattern (паттерны для инстанцирования классов).
    //
    // Создает только один объект класса, и предоставляет
    // только один глобальный доступ к этому объекту.
    public static Starbucks getInstance() {
        synchronized (Starbucks.class) {
            if (instance == null) {
                instance = new Starbucks();
            }
        }
        return instance;
    }
}

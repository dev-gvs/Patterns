package patterns.starbucks.employee;

import patterns.starbucks.data.Order;

public class Waiter {

    public void execute(Order order) {
        System.out.println("Официант получил " + order);
        order.execute();
    }
}

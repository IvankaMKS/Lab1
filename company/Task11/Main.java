package com.company.Task11;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Order order1 = new Order();
        Order order2 = new Order();

        order.addNewDriver("570", "Yura");
        order.addNewCar("570", 3234, "black", "Tesla");
        order.addNewCustomer(1, "0679457678", "Oleg");

        order1.addNewDriver("570", "Sofia");
        order1.addNewCar("570", 6345, "pink", "BMW");
        order1.addNewCustomer(2, "0676754345", "Yana");

        order2.addNewDriver("192", "Taras");
        order2.addNewCar("192", 6345, "white", "Audi");
        order2.addNewCustomer(3, "0975439090", "Lubomur");

        System.out.println(order);
        System.out.println(order1);
        System.out.println(order2);
    }

}

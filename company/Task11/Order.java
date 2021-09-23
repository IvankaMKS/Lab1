package com.company.Task11;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    int orderNumber;
    List<User> listOfCustomers;
    List<Driver> listOfDrivers;
    List<Car> listOfCars;


    Order() {
        listOfCustomers = new ArrayList<>();
        listOfDrivers = new ArrayList<>();
        listOfCars = new ArrayList<>();
    }

    public Order(int orderNumber) {
        this.orderNumber=orderNumber;
    }





    void addNewDriver(String ID, String name) {
        listOfDrivers.add(new Driver(ID, name));
    }

    void addNewCustomer(int orderNumber, String phone, String name) {
        listOfCustomers.add(new User(orderNumber, phone, name));
    }

    void addNewCar(String ID, int number, String color, String brand) {
        listOfCars.add(new Car(ID, number, color, brand));
    }

    @Override
    public String toString() {
        return "Order:" + "\n" +
                "listOfCustomers: " + listOfCustomers +
                ", listOfDrivers: " + "\n" + listOfDrivers +
                ", listOfCars: " + "\n" + listOfCars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(listOfCustomers, order.listOfCustomers) && Objects.equals(listOfDrivers, order.listOfDrivers) && Objects.equals(listOfCars, order.listOfCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfCustomers, listOfDrivers, listOfCars);
    }
}

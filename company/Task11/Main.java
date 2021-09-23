package com.company.Task11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static List<Driver> addDriver(final Driver driver){
        final List<Driver> driverList = new ArrayList<> ();
        driverList.add (driver);
        return driverList;
    }
    private static List<Order> addOrder(final Order order){
        final List<Order> driverList = new ArrayList<> ();
        driverList.add (order);
        return driverList;
    }
    public static void main(final String[] args) {


        final Driver driver1 = new Driver (945L,"Yana","Berkiv",19,380679419);
        final Driver driver2 = new Driver (151L,"Yura","Salab",26,380978321);
        final Driver driver3 = new Driver (480L,"Sofia","Kis",20,380678324);
        addDriver (driver1);

        final Car car1 = new Car(35L,"Mercedes-Benz","A-Class", addDriver (driver3) );
        final Car car2 = new Car(35L,"BMW","X Series",  addDriver (driver2));


        final Order order1 = new Order (744L,890.50, LocalDate.of(2020,5,10),"10 km",car1);
        final Order order2 = new Order (632L,760.40, LocalDate.of(2021,02,9),"8 km",car2);

        final User user1 = new User (490L,"Victot","Kalysh",29,addOrder (order1));
        final User user2 = new User (677L,"Oleg","Vantyh",37,addOrder (order2));



        System.out.println ("User orders a taxi 1: "+ user1);
        System.out.println();
        System.out.println ("User orders a taxi 2: "+ user2);

    }
}

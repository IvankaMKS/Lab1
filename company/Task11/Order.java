package com.company.Task11;

import java.time.LocalDate;

public class Order {
    private Long id_order;
    private Double price;
    private LocalDate time;
    private String distance;
    private Car car;

    public Order(final Long id_order, final Double price, final LocalDate time, final String distance, final Car car) {
        this.id_order = id_order;
        this.price = price;
        this.time = time;
        this.distance = distance;
        this.car = car;

    }

    @Override
    public String toString() {
        return "Order{" +
                "id_order=" + id_order +
                ", price=" + price +
                ", time=" + time +
                ", distance='" + distance + '\'' +
                ", car=" + car +
                '}';
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(final Long id_order) {
        this.id_order = id_order;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(final LocalDate time) {
        this.time = time;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(final String distance) {
        this.distance = distance;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(final Car car) {
        this.car = car;
    }
}

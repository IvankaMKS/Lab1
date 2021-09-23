package com.company.Task11;

import java.util.List;

public class Car {
    private Long id_car;
    private String typeCar;
    private String nameCar;
    private List<Driver> driver;

    public Car(final Long id_car, final String typeCar, final String nameCar, final List<Driver> driver) {
        this.id_car = id_car;
        this.typeCar = typeCar;
        this.nameCar = nameCar;
        this.driver = driver;
    }

    public Long getId_car() {
        return id_car;
    }

    public void setId_car(final Long id_car) {
        this.id_car = id_car;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(final String typeCar) {
        this.typeCar = typeCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(final String nameCar) {
        this.nameCar = nameCar;
    }

    public List<Driver> getDriver() {
        return driver;
    }

    public void setDriver(final List<Driver> driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id_car=" + id_car +
                ", typeCar='" + typeCar + '\'' +
                ", nameCar='" + nameCar + '\'' +
                ", driver=" + driver +
                '}';
    }
}

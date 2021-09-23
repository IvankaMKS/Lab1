package com.company.Task11;

public class Car extends Driver{
    private int number;
    private String color;
    private String brand;

    Car(String ID, int number, String color, String brand) {
        super(ID);
        this.number = number;
        this.color = color;
        this.brand = brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Car car = (Car) obj;
        return number == car.number
                && (color == car.color
                || (color != null && color.equals(car.getColor()))) && (brand == car.brand
                || (brand != null && brand.equals(car.getBrand())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                ((color == null) ? 0 : color.hashCode());
        result = prime * result +
                ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Car: " +"Driver ID: "+"ID"+
                ", number of car: " + number +
                ", color of car: " + color + '\'' +
                ", brand of car : " + brand + '\'' +
                ".";
    }
}

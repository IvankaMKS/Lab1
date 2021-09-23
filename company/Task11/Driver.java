package com.company.Task11;

public class Driver extends AbstractPerson{
    private Long id_driver;
    private Integer phone;

    public Driver(final Long id, final String firstName, final String lastName, final double age, final int phone) {
        this.id_driver=id;
        setFirstName (firstName);
        setLastName (lastName);
        setAge (age);
        this.phone=phone;
    }

    public Long getId_driver() {
        return id_driver;
    }

    public void setId_driver(final Long id_driver) {
        this.id_driver = id_driver;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(final Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id_driver=" + id_driver +
                ", phone=" + phone +
                " " + super.toString ();
    }
}

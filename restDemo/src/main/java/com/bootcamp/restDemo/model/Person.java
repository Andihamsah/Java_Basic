package com.bootcamp.restDemo.model;

public class Person {
    private int id;
    private String name;
    private String address;
    private String gender;
    private String hoby;

    public Person(int id, String name, String address, String gender, String hoby) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.hoby = hoby;
    }

    public Person(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getHoby() {
        return hoby;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }
}

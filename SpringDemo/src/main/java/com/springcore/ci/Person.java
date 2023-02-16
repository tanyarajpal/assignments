package com.springcore.ci;
public class Person {
    private int id;
    private String name;
    private Certi certi;
    public Person(int id, String name, Certi certi) {
        super();
        this.id = id;
        this.name = name;
        this.certi = certi;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
    }
    
    
}
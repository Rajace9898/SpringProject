package com.springcore.constructorinjection;

public class Human {
    private int personId;
    private String name;
    private Certi certi;

    public Human(int personId, String name,Certi certi) {
        this.personId = personId;
        this.name = name;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return this.personId+" : "+this.name+" : "+this.certi;
    }
}

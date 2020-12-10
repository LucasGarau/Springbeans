package com.esliceu.demoSpring;

public class PersonFactory {
    public static Person getPerson(String name, int year){
        return new Person(name,year);
    }
}

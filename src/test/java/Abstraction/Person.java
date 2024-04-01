package Abstraction;

public abstract class Person {

    String name;

    abstract void eat();

    void smell(){

        System.out.println("I can smell");
    }



    abstract void walk();


    Person(String name1) {

        this.name = name1;
        System.out.println(this.name);


    }}

package Abstraction;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Indian extends Person{
    Indian(String name1) {    // if parent has constructor then child will also going to have
        super(name1);
    }

    @Override// These are abstract method in parent class so implemented here in child
   public void eat() {
        System.out.println("I can eat");
    }

    @Override// These are abstract method in parent class so implemented here in child
    public void walk() {

        System.out.println(" i can walk");

    }

    public void cycling(){

        System.out.println("I can drive cycle");


    }


}

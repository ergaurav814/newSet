package NestedClass;

public class SecurityThing {


    public static void main(String[] args) {

        Outer n1 = new Outer();
        n1.m1();

    }
}

class Outer{

    static int uu = 10;
    int a=10;

    void m1(){

        System.out.println("Outer Class");

        Inner n= new Inner();  // declaring object for the inner class in outer clas so that we can access inner
        //inner class functions without mentioning anything about inner class: security
        n.m2_secret();


    }

class Inner{

    static int secret = 90;

    void m2_secret(){

        System.out.println("Inner Secret" + secret);

    }


}}
package Generics;

public class SimpleExample {


    public static <T> void temp(T a){  // for generic we need to use diamond operator

        System.out.println(a);

    }

    public static void main(String[] args) {

        temp(20);
        temp(20.30);

    }



}

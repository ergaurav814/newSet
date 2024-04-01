package NestedClass;

public class StaticNested {


    public static void main(String[] args) {


        OuterClass oc = new OuterClass();
        System.out.println(oc.a);

        OuterClass.InnerClass oi = new OuterClass.InnerClass();
        oi.show();


    }


}


class OuterClass{

 static int o = 10;

 int a= 20;  //instance variable



    static class InnerClass{

        void show(){

            System.out.println(o);

           // System.out.println(a); // non static members can not be accessed

        }


    }


}
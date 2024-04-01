package Generics;

public class GenericClass {

    public static void main(String[] args) {


        Generic<Integer> gen = new Generic(12);
        System.out.println(gen.getObject());


        Generic<String> gen2 = new Generic(12);
        gen2.getObject();
        Generic<Double> gen3 = new Generic(12.67);
        gen3.getObject();


    }


}


class Generic <T>{

    T Obj;


    public Generic(T obj) {
       this.Obj = obj;
    }

    public T getObject(){

        return this.Obj;
    }

}






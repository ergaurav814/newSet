package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Cf01 {
    public static void main(String[] args) {


        ArrayList l = new ArrayList();

        l.add("gaurav");
        l.add("vanshita");

        System.out.println(l);

        Iterator i = l.iterator();// l has implemeted this so it means arraylist has implementation of this interface

//        while(i.hasNext()){
//
//            System.out.println(i.next());    // Iterator has two functions>> hasnext() and next
//        }

           for(Object o :l){
               System.out.println(o);

           }



    }


}

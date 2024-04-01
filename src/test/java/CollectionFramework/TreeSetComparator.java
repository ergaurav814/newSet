package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparator {

    public static void main(String[] args) {

      //  TreeSet<SSStudent> treee = new TreeSet<>(new SortByID()); // in case we need to sort with ID
       TreeSet<SSStudent> treee = new TreeSet<>(new SortByName());// in case we need to sort by name

        SSStudent s4 = new SSStudent(1,"taurav","31");
        SSStudent s5 = new SSStudent(3,"Gaurav","35");
        SSStudent s6 = new SSStudent(2,"Aaurav","40");

        treee.add(s4);
        treee.add(s5);
        treee.add(s6);

      Iterator i = treee.iterator();
      while(i.hasNext()){
          System.out.println(i.next());

      }


        }





    }


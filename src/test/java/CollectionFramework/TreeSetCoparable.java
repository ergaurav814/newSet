package CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCoparable {


    public static void main(String[] args) {

        Set<SStudent> treeSet = new TreeSet<>();

        SStudent s1 = new SStudent("Gaurav","21",1);
        SStudent s2 = new SStudent("Gaurav","21",1);
        SStudent s3 = new SStudent("Hanish","23",2);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        System.out.println(treeSet.size());  // it ois showing size as two because with comparable we negated duplicate id



    }






}

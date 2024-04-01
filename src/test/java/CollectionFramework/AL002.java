package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class AL002 {   //Array list usage

    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Vanshita","31"); // can be done like this
        s1.setName("Sachin"); // with seeter chnages the name
        students.add(s1); //s1 the again we have to add like this. by upper style we dont need to do separately

        //student 2
        students.add(new Student("Gaurav","31")); // can be done like this too
        System.out.println(students.size());

        for (Student s2 : students){

            System.out.println(s2.getName());

        }

        Iterator i = students.iterator();
        while(i.hasNext()){

            Student temp = (Student)i.next(); // type coversion// next returns method so it will return whole student values, name and age
            // so to access specific functions get or set declred in Student class we have too declare this as object Student class
            // to access functions
            System.out.println(temp.getName());
            System.out.println(temp.getAge());

          //  System.out.println(i.next()); // this alone can print all thge details but we want name so upper method used

        }

    }


}

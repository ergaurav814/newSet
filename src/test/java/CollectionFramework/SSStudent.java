package CollectionFramework;

import java.util.Comparator;

public class SSStudent {

   private int Id ;

   private String name;

   private String age;

    public SSStudent(int id, String name, String age) {
        Id = id;
        this.name = name;
        this.age = age;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SSStudent{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    }

class SortByID implements Comparator<SSStudent> {


    @Override
    public int compare(SSStudent student1, SSStudent student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }

    }

class SortByName implements Comparator<SSStudent> {

    @Override
    public int compare(SSStudent s3, SSStudent s4) {
        return s3.getName().compareTo(s4.getName());
    }

}



package CollectionFramework;

public class SStudent implements Comparable<SStudent> {

    private String name;

    private String age;

    private int ID ;


    public SStudent(String name, String age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "SStudent{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(SStudent o) {

      // compare s1.id - s2.d =0 // will remove the duplicate item by id
        //s1.id >s2.id > ASC
        //s1.id<s2.id > DSc

        return this.ID-o.ID;


      //  for String variable conditopn would be return this.name.compareTo(o.name)




    }
}






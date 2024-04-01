package Encapsulation;

public class RunerClass {

    public static void main(String[] args) {


        Encs001 en = new Encs001("Gaurav","Mypass");

        //en.Password="Gaurav"; //her by providing access to user to change pass is wron as it is security risk.
        // so will do the modification
        //System.out.println(en.Password);
        //en.setPassword("jk");
       // System.out.println(en.getPassword());
        boolean LoggedIn= en.UserIsLoggedIn("Gaurav","Mypass");
        System.out.println(LoggedIn);

       // System.out.println(LoggedIn);
  // 16 and 18 belongs to backend code . we are not giving this to user.




    }



}

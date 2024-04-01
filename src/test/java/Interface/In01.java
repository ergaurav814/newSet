package Interface;

public class In01 {

    public static void main(String[] args) {

        StandardLogin s1 = new AdminLogin();
        s1.login();
        StandardLogin s2 = new BuyersLogin();
        s2.login();

        AdminLogin a1 = new AdminLogin();  // we can do this as AdminLogin implements StandardLogin
        a1.m1();
        a1.login();

    }
}


interface a {   // a nd b has common name function so implemented by C class , solved diamond issue
    
    void m1();
    
}

interface b{

    void m1();


}

        interface StandardLogin {
            void login();

            default void m1(){     // can have default and unlimited
                System.out.println(" I am default");
            }
        }


        class AdminLogin implements StandardLogin {


            @Override
            public void login() {
                System.out.println("I am admin login");
            }
        }


        class UserLogin implements StandardLogin {


            @Override
            public void login() {

                System.out.println(" I am User Login");
            }
        }


        class BuyersLogin implements StandardLogin {


            @Override
            public void login() {

                System.out.println(" I am Buyers Login");
            }
        }

class C implements a,b {    // here it solved diamond problem -->> multiple inheritance issue



    @Override
    public void m1() {

    }

}

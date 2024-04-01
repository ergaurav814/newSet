package Encapsulation;

import org.openqa.selenium.json.JsonOutput;

public class Encs001 {

    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    Encs001(String u, String p) {

        this.Username = u;
        this.Password = p;

    }

  public boolean UserIsLoggedIn(String username, String password) {

        if (this.Username.equals(username) && this.Password.equals(password)) {

            System.out.println("User is logged in");

            return true;}

else {
            System.out.println("Wrong user");
            return false;
        }
    }
}
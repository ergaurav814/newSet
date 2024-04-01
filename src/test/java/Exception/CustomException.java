package Exception;

public class CustomException {

    public static void main(String[] args) throws InsufficientFundsException {


        Bankaccount Scotia = new Bankaccount(1000);
        Scotia.withdraw(1100);
        Scotia.showBalance();

    }
}
class InsufficientFundsException extends Exception{  //  see copy for this step

    public InsufficientFundsException(){
        super();
    }
public InsufficientFundsException(String message){

        super(message);

}

}
class Bankaccount{
    private double balance;

    public Bankaccount(double balance){  //const

        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
    if(balance<amount){
        throw new InsufficientFundsException("You dont have sufficient balance");
    }
        balance -= amount;
    }


    public void showBalance(){

        System.out.println(balance);
    }
}
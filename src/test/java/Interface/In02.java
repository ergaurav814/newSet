package Interface;

public class In02 {

    public static void main(String[] args) {

    }

}


interface Calc{

    void add();
    void subtraction();

    }


class Normalcalc implements Calc {


    @Override
    public void add() {

        int a = 10;
        int b = 20;

        System.out.println("A+B" + a+b);

    }
    @Override
    public void subtraction() {


    }
}

class ScifiCalc implements Calc{


    @Override
    public void add() {

        double a= 20.3;
        double b= 20.30;

        System.out.println("A+B" + a+b);


    }

    @Override
    public void subtraction() {

    }
}


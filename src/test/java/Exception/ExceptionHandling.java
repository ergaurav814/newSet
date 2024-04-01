package Exception;

public class ExceptionHandling

{
    public static void main(String[] args) {

        int i =10;

        try {

            float result = i/0 ;
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("passed");
    }


}

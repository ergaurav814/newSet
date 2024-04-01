package Exception;

public class PerfectHandling {

    public static void main(String[] args) {

      try {
          String ip = args[0]; //arraoutofbound
          int a = Integer.parseInt(args[0]); // numberformatexception
          int b = 10 / a;//arithmeticexception
      }

      catch (NumberFormatException  | ArithmeticException | ArrayIndexOutOfBoundsException  e)
      {
          System.out.println(e.getMessage());
      }
          catch (Exception e)
          {
          e.getMessage();
          }


    }

}

package Exception;

public class Ex003 {  // bad approach but right very junior tester


        public static void main(String[] args) {

            int a = 0;
            try {
                a = Integer.parseInt(args[0]);
            } catch (NumberFormatException exception) {
                exception.printStackTrace();
            }

            try {
                int b = 10 / a;
            } catch (ArithmeticException exception) {
                exception.printStackTrace();
            }

            try {
                String ip = args[0];
            } catch (ArrayIndexOutOfBoundsException exception) {
                exception.printStackTrace();
            }

        }
    }



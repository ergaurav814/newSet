package JavaPractice;

import java.util.Scanner;

public class TablePrint

{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int n= sc.nextInt();

        sc.close();

        for(int i=1; i<=10; i++){

            System.out.println(n+" × "+ i +" = "+ n*i);


        }






    }


}

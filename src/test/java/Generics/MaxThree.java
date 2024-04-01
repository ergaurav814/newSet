package Generics;

public class MaxThree {


    public static <T extends Comparable<T>> T MaximumOf(T a, T b, T c) {


        T max = a;

        if (b.compareTo(max) > 0) {

            max = b;
        }

        if (c.compareTo(max) > 0) {

            max = c;
        }

        return max;

    }


    public static void main(String[] args) {


        System.out.println(MaximumOf("g","a","h"));
        System.out.println(MaximumOf(12,14,100));


    }





}








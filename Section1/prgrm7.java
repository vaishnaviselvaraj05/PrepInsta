package Section1;

import java.util.Scanner;

public class prgrm7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        greatestThreenumbers(a,b,c);
    }

    public static void greatestThreenumbers(int a , int b , int c)
    {
        if(a > b && a > c)
        {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

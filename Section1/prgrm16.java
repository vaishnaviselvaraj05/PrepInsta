package Section1;

import java.util.Scanner;

public class prgrm16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fibonacciNumbers(n);
    }

    public static void fibonacciNumbers(int n)
    {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int next;
        for(int i = 2 ; i < n ; i++)
        {
            next = a + b ;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}

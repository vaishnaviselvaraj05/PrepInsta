package Section1;

import java.util.Scanner;

public class prgrm18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factorialNumber(n);
    }

    public static void factorialNumber(int n)
    {
        int res = 1;
        for(int i = 2 ; i <= n ; i++)
        {
            res *= i;
        }
        System.out.println(res);
    }
}

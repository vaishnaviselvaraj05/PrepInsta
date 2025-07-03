package Section1;

import java.util.Scanner;

public class prgrm22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(strongNumber(n))
        {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static boolean strongNumber(int n)
    {
        int temp = n;
        int sum = 0;
        while(temp > 0)
        {
            int digits = temp % 10;
            sum += fact(digits);
            temp /= 10;
        }
        return n == sum;
    }

    public static int fact(int digits)
    {
        int res = 1;
        for(int i = 2 ; i<= digits ; i++)
        {
            res *= i;
        }
        return res;
    }
}

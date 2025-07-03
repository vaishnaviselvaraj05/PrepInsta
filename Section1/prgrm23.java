package Section1;

import java.util.Scanner;

public class prgrm23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        perfectNumber(n);
    }

    public static void perfectNumber(int n)
    {
        int sum = 0;
        for(int i = 1 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }
    }
}

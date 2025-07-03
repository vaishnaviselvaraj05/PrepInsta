package Section1;

import java.util.Scanner;

public class prgrm21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        primeFactorsofNumbers(n);
    }

    public static void primeFactorsofNumbers(int n)
    {
        while(n % 2 == 0)
        {
            System.out.println(2);
            n /= 2;
        }

        for(int i = 3 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.println(i);
                n /= i;
            }
        }

        if(n > 2)
        {
            System.out.println(n);
        }
    }
}

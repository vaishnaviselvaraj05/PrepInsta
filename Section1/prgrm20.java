package Section1;

import java.util.Scanner;

public class prgrm20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factorNumber(n);
    }

    public static void factorNumber(int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            if(n % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}

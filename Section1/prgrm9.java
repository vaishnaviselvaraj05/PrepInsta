package Section1;

import java.util.Scanner;

public class prgrm9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primeNumber(n);
    }

    public static void primeNumber(int n)
    {
        int count = 0;
        if(n < 2)
        {
            System.out.println("Not Prime");
            System.exit(0);
        }
        for(int i = 1 ; i <= n ; i++)
        {
            if((n % i) == 0){
                count += 1;
            }
        }
        if(count > 2) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}

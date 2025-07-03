package Section1;

import java.util.Scanner;

public class prgrm25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sq = n * n;
        if(automorphicNumber(n))
        {
            System.out.println(sq + " is Automorphic Number");
        } else {
            System.out.println(sq + " is not Automorphic Number");
        }
    }

    public static boolean automorphicNumber(int n)
    {
        int square = n * n;
        int temp = n;
        int digits =0 ;
        while(temp > 0)
        {
            digits++;
            temp /= 10;
        }
        int res = (int)Math.pow(10 , digits);
        return (square % res == n);
    }
}

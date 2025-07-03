package Section1;

import java.util.Scanner;

public class prgrm13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        palindromeNumber(n);
    }

    public static void palindromeNumber(int n)
    {
        int res = 0;
        int sign = n < 0 ? -1 : 1;
        int npos = Math.abs(n);
        while(npos > 0)
        {
            int digits = npos % 10;
            res = res * 10 + digits;
            npos = npos / 10;
        }
        int result = res * sign;
        System.out.println(result);
        if(n == result)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

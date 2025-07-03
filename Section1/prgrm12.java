package Section1;

import java.util.Scanner;

public class prgrm12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        reverseNumber(n);
    }

    public static void reverseNumber(int n)
    {
        int res = 0;
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);
        while(n > 0)
        {
            int digits = n % 10;
            res = res * 10 + digits;
            n = n / 10;
        }
        System.out.println(res * sign);
    }
}

package Section1;

import java.util.Scanner;

public class prgrm26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        harshadNumber(n);
    }

    public static void harshadNumber(int n)
    {
        int og = n;
        int res = 0;
        while(n > 0)
        {
            int digits = n % 10;
            res = res + digits;
            n /= 10;
        }
        if(og % res == 0)
        {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");
        }
    }
}

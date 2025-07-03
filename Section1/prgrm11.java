package Section1;

import java.util.Scanner;

public class prgrm11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        sumOfdigits(a);
    }

    public static void sumOfdigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

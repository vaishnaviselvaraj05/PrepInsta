package Section1;

import java.util.Scanner;

public class prgrm19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        powerNumbers(a,b);
    }

    public static void powerNumbers(int a , int b)
    {
        double res = Math.pow(a , b);
        System.out.println(res);

    }
}

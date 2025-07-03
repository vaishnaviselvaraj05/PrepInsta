package Section1;

import java.util.Scanner;

public class prgrm2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        evenOrodd(n);
    }

    public static void evenOrodd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

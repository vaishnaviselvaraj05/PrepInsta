package Section1;

import java.util.Scanner;

public class prgrm6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        greatestNumber(a,b);
    }

    public static void greatestNumber(int a , int b)
    {
        if(a > b)
        {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}

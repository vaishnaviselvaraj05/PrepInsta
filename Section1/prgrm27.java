package Section1;

import java.util.Scanner;

public class prgrm27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        abundantNumber(n);
    }

    public static void abundantNumber(int n)
    {
        int sum = 0;
        for(int i = 1 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        if(sum > n)
        {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not Abundant Number");
        }
    }
}

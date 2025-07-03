package Section1;

import java.util.Scanner;

public class prgrm14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int len = order(num);
        if (armstrongNumber(num , len))
        {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }

    public static int order(int num)
    {
        int len = 0;
        while(num > 0)
        {
            len++;
            num = num / 10;
        }
        return len;
    }

    public static boolean armstrongNumber(int num , int len)
    {
        int sum = 0;
        int temp = num;
        while(temp > 0)
        {
            int digits = temp % 10;
            sum += (int)Math.pow(digits,len);
            temp = temp / 10;
        }
        return num == sum;
    }
}

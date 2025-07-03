package Section1;

import java.util.Scanner;

public class prgrm15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        armstrongNumberwithinRange(n1,n2);
    }

    public static void armstrongNumberwithinRange(int n1 , int n2)
    {
        for(int i = n1 ; i <= n2 ; i++)
        {
            int sum = 0;
            int len = order(i);
            int temp = i;
            while(temp > 0)
            {
                int digits = temp % 10;
                sum += (int)Math.pow(digits,len);
                temp /= 10;
            }
            if(sum == i)
            {
                System.out.println(sum);
            }
        }
    }

    public static int order(int num)
    {
        int len = 0;
        while(num > 0)
        {
            len++;
            num /= 10;
        }
        return len;
    }
}

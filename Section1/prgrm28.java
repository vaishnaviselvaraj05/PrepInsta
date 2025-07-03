package Section1;

import java.util.Scanner;

public class prgrm28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int sum1 = friendlyPairs(n1);
        int sum2 = friendlyPairs(n2);
        if (sum1 / n1 == sum2 / n2)
        {
            System.out.println("Friendly Pairs");
        } else {
            System.out.println("Not Friendly Pairs");
        }
    }

    public static int friendlyPairs(int num)
    {
        int sum = 0;
        for(int i = 1 ; i < num ; i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
}

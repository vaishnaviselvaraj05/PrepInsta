package Section1;

import java.util.Scanner;

public class prgrm3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumOfnaturalNumbers(n);
    }

    public static void sumOfnaturalNumbers(int n)
    {
        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}

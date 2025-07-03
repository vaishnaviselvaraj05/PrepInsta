package Section1;

import java.util.Scanner;

public class prgrm4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sumOfnaturalNumbersn(n);
    }

    public static void sumOfnaturalNumbersn(int n)
    {
        int sum = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}

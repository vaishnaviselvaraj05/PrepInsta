package Section1;

import java.util.Scanner;

public class prgrm5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        sumOfnumbersInrange(n1,n2);
    }

    public static void sumOfnumbersInrange(int n1 , int n2)
    {
        int sum = n1;
        for(int i = n1 + 1 ; i <= n2 ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}

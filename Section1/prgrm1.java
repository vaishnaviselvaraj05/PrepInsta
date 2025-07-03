package Section1;

import java.util.Scanner;

public class prgrm1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        positiveOrnegative(n);
    }

    public static void positiveOrnegative(int n) {
        if(n >= 0)
        {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
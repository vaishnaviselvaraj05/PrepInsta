package Section1;

import java.util.Scanner;

public class prgrm10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        for (int i = a; i <= b; i++) {
            if (primeRangenumbers(i)) {
                System.out.println(i);  // ✅ Only print if i is prime
            }
        }
    }

    public static boolean primeRangenumbers(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

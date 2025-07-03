package Section1;

import java.util.Scanner;

public class prgrm24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        perfectSquarenumber(n);
        if(perfectSquarenumber(n))
        {
            System.out.println("Perfect Square Number");
        }else {
            System.out.println("Not Perfect Square Number");
        }
    }

    public static boolean perfectSquarenumber(int n)
    {
        if(n >=0)
        {
            int res = (int) Math.sqrt(n);
            return (res * res) == n;
        }
        return false;
    }


}

package Section1;

import java.util.Scanner;

public class prgrm8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        leapYear(year);
    }

    public static void leapYear(int year)
    {
        if(year % 400 == 0){
            System.out.println("Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}

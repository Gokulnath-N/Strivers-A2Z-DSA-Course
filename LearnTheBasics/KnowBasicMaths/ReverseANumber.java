package KnowBasicMaths;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        boolean isNegative=false;
        if(x<0)
        {
            isNegative = true;
            x = x * -1;
        }
        int rem =0; long rev=0;
        while(x != 0)
        {
            rem = x % 10;
            rev = rev*10 + rem;
            x = x/10;
        }
        if(rev<Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;

        return (int)(isNegative? -rev : rev);
    }
}

package KnowBasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Write your code here
        int n=1,sum=0,temp=n,last=0,digits=0;
        while(temp>0)
        {
            temp /=10;
            digits++;
        }
        temp=n;
        while(temp>0)
        {
            int rem = n %10;
            sum +=Math.pow(rem, digits);
            temp /=10;
        }
        if(sum == n)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

package KnowBasicMaths;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        if(n%1==0 && n%n ==0)
            System.out.println("prime number");
        else
            System.out.println("Not a prime number");
    }
}

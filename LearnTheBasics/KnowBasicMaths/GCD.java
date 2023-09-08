package KnowBasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gcd=0;
        System.out.println("Enter the value of n1:");
        int n1= input.nextInt();
        System.out.println("Enter the value of n2: ");
        int n2= input.nextInt();
        for(int i=1;i<=n1;i++)
        {
            if(n1%i == 0 && n2%i == 0)
                gcd = i;
        }
        System.out.println("GCD is " + gcd);
    }
}

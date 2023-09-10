package BasicRecursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print1(1,n);
        print2(n,n);
    }
    static void print1(int i, int n)
    {
        if(i>n) return;
        System.out.println(i);
        print1(i+1,n);
    }
    // using bactracking
    static void print2(int i, int n)
    {
        if(i<0)
            return;
        print2(i-1,n);
        System.out.println(i);
    }
}

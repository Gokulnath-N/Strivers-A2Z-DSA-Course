package KnowBasicMaths;

import java.util.Scanner;

public class CountDigits {
//    Given an integer N, write a program to count the number of digits in N
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n= input.nextInt(),count=0;
    while(n>0)
    {
        n = n / 10;
        count++;
    }
    System.out.println(count);
}
}

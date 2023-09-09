package BasicRecursion;


import java.util.Scanner;

public class PrintingNTimes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        print(1,n);
    }

    static void print(int i, int n)
    {
        //base condition
        if(i>n)
            return;
        System.out.println("Gokulnath");
        print(i+1,n);
    }
}

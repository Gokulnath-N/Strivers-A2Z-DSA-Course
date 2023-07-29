import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
    Scanner input = new Scanner(System.in);
    char val = input.next().charAt(0);
        if (Character.isUpperCase(val))
            System.out.println("1");
        else if (Character.isLowerCase(val))
            System.out.println("0");
        else
            System.out.println("-1");
    }
}

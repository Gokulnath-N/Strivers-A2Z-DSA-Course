package BasicHashing;

import java.util.*;

class CharachterFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();

        //precomputing
        int hash[] = new int[26];
        for(int i=0;i < s.length();i++)
        {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.println("Enter the size of the query:");
        int q = input.nextInt();
        System.out.println("Enter a character to find its frequency:");
        while(q-- > 0)
        {
            char c =input.next().charAt(0);
            //fetching
            System.out.println(hash[c - 'a']);
        }

    }
}
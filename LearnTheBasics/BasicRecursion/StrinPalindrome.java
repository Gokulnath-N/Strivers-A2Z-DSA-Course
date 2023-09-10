package BasicRecursion;

import java.util.logging.SocketHandler;

public class StrinPalindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        System.out.println(stringReverse(0,s));
    }
    static boolean stringReverse(int i, String s)
    {
       if(s.length()/2 >= 0) return true;
       if(s.charAt(i) != s.charAt(s.length()-i-1))
           return false;
        return stringReverse(i+1,s);
    }
}

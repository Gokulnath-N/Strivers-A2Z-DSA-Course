package BasicRecursion;

public class NToOne {
    public static void main(String[] args) {
        int n=4;
        print(n,n);
        print2(1,n);
    }
    static void print(int i, int n)
    {
        if(i<1) return;
        System.out.println(i);
        print(i-1,n);
    }
    // using backtracking
    static  void print2(int i, int n)
    {
        if(i>n)
            return;
        print2(i+1,n);
        System.out.println(i);
    }
}

package BasicRecursion;

public class NToOne {
    public static void main(String[] args) {
        int n=4;
        print(n,n);
    }
    static void print(int i, int n)
    {
        if(i<1) return;
        System.out.println(i);
        print(i-1,n);
    }
}

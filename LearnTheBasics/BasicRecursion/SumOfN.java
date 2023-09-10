package BasicRecursion;

public class SumOfN {
    public static void main(String[] args) {
        int n=5,sum=0;
        for(int i=1;i<=n;i++)
        {
           sum +=i;
        }
        System.out.println(sum);
        sum1(n,0);
        System.out.println(sum2(n));

    }
    static void sum1(int n,int sum)
    {
        if(n<0){
            System.out.println(sum);
            return;
        }
        sum1(n-1,sum+n);

    }
    static int sum2(int n)
    {
        if(n==0) return 0;
        return n + sum2(n-1);
    }
}

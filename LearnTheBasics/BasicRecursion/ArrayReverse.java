package BasicRecursion;


import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length - 1;
        for(int i=n;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        int[] revArr = reverse(arr,0,n);
        System.out.println(Arrays.toString(revArr));
    }
    static int[] reverse(int[] a,int i,int j)
    {
        if(i<j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            reverse(a, i+1, j-1);
        }
        return a;
    }
}

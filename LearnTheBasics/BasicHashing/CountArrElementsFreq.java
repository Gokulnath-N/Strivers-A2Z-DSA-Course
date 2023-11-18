package BasicHashing;

import java.util.*;

public class CountArrElementsFreq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        countFrequency(arr,n);
    }
    static void countFrequency(int[] arr, int n)
    {
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(visited[i])
                continue;
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+ " " + count);
        }
    }
}

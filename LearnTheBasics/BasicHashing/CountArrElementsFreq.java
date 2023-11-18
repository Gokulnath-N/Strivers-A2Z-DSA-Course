package BasicHashing;

import java.util.*;

public class CountArrElementsFreq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        //countFrequency(arr,n);
        frequencyUsingMap(arr,n);
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
    static void frequencyUsingMap(int[] arr, int n)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int freq=0;
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
       }
    }


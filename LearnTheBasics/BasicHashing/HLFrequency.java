package BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class HLFrequency {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        countFrequency(arr,n);
        System.out.println("Frequency using map");
        frequencyUsingMap(arr, n);
    }
    static void countFrequency(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];
        int maxEle=0,maxFre=0;
        int minEle=0,minFre=n;
        for(int i=0;i<n;i++)
        {
            if(visited[i])
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j]=true;
                    count++;
                }
            }
            if (count > maxFre) {
                maxEle = arr[i];
                maxFre = count;
            }
            if (count < minFre) {
                minEle = arr[i];
                minFre = count;
            }
        }
        System.out.println("Highest frequency: " + maxEle);
        System.out.println("Lowest frequency: " + minEle);
    }
    static void frequencyUsingMap(int arr[], int n)
    {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(arr[i]))
                mp.put(arr[i], mp.get(arr[i]) + 1);
            else mp.put(arr[i], 1);
        }
        int minEle=0,maxEle=0;
        int minFre=n,maxFre=0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            int element = entry.getKey();
            int count = entry.getValue();
            if (count > maxFre) {
                maxEle = element;
                maxFre = count;
            }
            if (count < minFre) {
                minEle = element;
                minFre = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
        }
    }


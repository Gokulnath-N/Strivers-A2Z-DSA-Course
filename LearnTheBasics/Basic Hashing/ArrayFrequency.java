import java.util.*;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        //precomputing
        int hash[] = new int[13];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]] +=1;
        }
        System.out.println("Enter the query");
        int q = input.nextInt();
        while(q-- != 0)
        {
            int number = input.nextInt();
            // fetching the pre-stored values
            System.out.println(hash[number]);
        }
    }
}
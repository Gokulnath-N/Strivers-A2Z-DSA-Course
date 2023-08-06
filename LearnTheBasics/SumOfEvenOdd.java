import java.util.*;
public class SumOfEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
	Scanner input = new Scanner(System.in);
	int n = input.nextInt(),evenNumber=0,oddNumber=0;
	while(n!=0)
	{
		int rem=n%10;
		if(rem%2 == 0)
		{
			evenNumber += rem;
		}
		else
		{
			oddNumber += rem;
		}
		n=n/10;
	}
	System.out.print(evenNumber);
	System.out.print(" " + oddNumber);
		}
}

package Patterns;

public class AlphaHill {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<= n-i-1;j++)
            {
                System.out.print(" ");
            }
            char ch='A';
            int breakPoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(ch);
                if(j<= breakPoint)
                    ch++;
                else
                    ch--;
            }
            for(int j=1;j<= n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

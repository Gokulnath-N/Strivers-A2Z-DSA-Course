class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++)
       {
           for(int j=n;j>=i;j--)
           {
               System.out.print(n-j+1+" ");
           }
           System.out.println();
       }
    }
}

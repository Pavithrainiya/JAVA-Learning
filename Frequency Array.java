public class Main
{
    public static void main(String[]args)
    {
        int madhan[]={1,1,1,2,2,3,4,4,4};
        int fmaadhav[]= new int[257];
        for(int i=0;i<9;i++)
        {
            fmaadhav[madhan[i]]++;
            }
        for(int i=0;i<257;i++)
        {
            if(fmaadhav[i]>0)
            System.out.println(i+" "+fmaadhav[i]);
            }
    }
}

java -cp /tmp/uk0wFvsIu6/Main
1 3
2 2
3 1
4 3

=== Code Execution Successful ===
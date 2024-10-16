public class Main
{
    public static void main(String[]args)
    {
        int madhan[]={1,1,2,2,3};
        int fmaadhav[]= new int[257];
        for(int i=0;i<5;i++)
        {
            fmaadhav[madhan[i]]++;
            }
        for(int i=0;i<257;i++)
        {
            if(fmaadhav[i]==1)
            System.out.println(i);
            }
    }
}


java -cp /tmp/0cIP1BuQRM/Main
3

=== Code Execution Successful ===
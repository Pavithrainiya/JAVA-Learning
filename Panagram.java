public class Main{
    public static void main(String[]args)
    {
        String santhosh="abcdefghijklmnopqrstuvwxyz";
        int fmaadhav[]=new int[26];
        int c=0;
        String m=santhosh.toUpperCase();
        for(int i=0;i<m.length();i++)
        {
        if(m.charAt(i)>='A'&& m.charAt(i)<='Z')
        fmaadhav[m.charAt(i)-'A']++;
        }
        for(int i=0;i<santhosh.length();i++)
        {
            if(fmaadhav[i]>=1)
            c++;
        }
        if(c==26)
        {
            System.out.println("It is a panagram");
        }
        else
        {
            System.out.println("Not a panagram");
        }
    }
}

java -cp /tmp/5PrwgXNni2/Main
It is a panagram

=== Code Execution Successful ===

---------------------------------------------------------------------------------


/*
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
            System.out.println(i+" "+fmaadhav[i]);
            }
    }
}

*/
public class Main{
    public static void main(String[]args)
    {
        String santhosh="abcdefghijklmnopqrstuvwxyz";
        int fmaadhav[]=new int[26];
        int c=0;
        String m=santhosh.toUpperCase();
        for(int i=0;i<m.length();i++)
        {
        if(m.charAt(i)>='A'&& m.charAt(i)<='Z')
        fmaadhav[m.charAt(i)-'A']++;
        }
        for(int i=0;i<santhosh.length();i++)
        {
            if(fmaadhav[i]==0)
            System.out.print((char)(i+'A'));
        }
        if(c==26)
        {
            System.out.println("It is a panagram");
        }
        else
        {
            System.out.println("Not a panagram");
        }
    }
}

java -cp /tmp/5rhHUCU9BF/Main
Not a panagram

=== Code Execution Successful ===

public class Main{
    public static void main(String[]args)
    {
       String a="monitor mouse keyboard";
       String arr[]=a.split(" ");
       for(int i=a.length()-1;i>=0;i--)
       {
           System.out.print(a.charAt(i)+ " ");
       }
    }
}
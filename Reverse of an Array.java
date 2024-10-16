public class Main{
    public static void main(String[]args)
    {
        String a="monitor mouse keyboard";
        String arr[]=a.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
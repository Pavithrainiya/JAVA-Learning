public class Main{
    public static void main(String[]args)
    {
        String a="This girl looks beautiful";
        String arr[]=a.split(" ");
        for(int i=0;i<arr.length-1;i+=2)
        {
            String t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
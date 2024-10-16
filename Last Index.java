import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s="mohammed samiqkhan,frd of madhu";
        //int len=s.length();
        //System.out.print(len);
        int lastindexof =s.lastIndexOf('o');
        System.out.print(lastindexof);
    }
}
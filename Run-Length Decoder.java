import java.util.Scanner;
public class Main{
    public static void main(String[]args)   {
    Scanner in=new Scanner(System.in);
    char[] ch=in.nextLine().toCharArray();
    for(int i=0;i<ch.length;i+=2)
    {
        int n=ch[i+1]-'0';
        while(n-->0)
        System.out.print(ch[i]);
        }
    }
}

java -cp /tmp/k4PRt0CrD2/Main
a1b2c3
abbccc
=== Code Execution Successful ===
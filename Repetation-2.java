public class Main{
    public static void main(String[]args)
    {
        String a="thols bought a new specs";
        int fmaadhav[]=new int[257];
        int c=0;
        char[]m=a.toCharArray();
        for(int i=0;i<m.length;i++) 
        {
            fmaadhav[m[i]]++;
        }
        for(int i=0;i<257;i++)
        {
            if(fmaadhav[i]>1&&i!=32)
            System.out.print((char)i+"");
        
    }
}
}
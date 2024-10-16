public class Main
{
    public static void main(String[] args)
    {
        String a= "danish buyss cAr";
        int fmaadhav[]=new int [257];
        int c=0;
        char []m=a.toCharArray();
        for(int i=0;i<m.length;i++) {
            fmaadhav[m[i]]++;
        }
        for(int i=0;i<257;i++)  {
            if(fmaadhav[i]>1)
            System.out.println((char)i+"");
            
        }
    }
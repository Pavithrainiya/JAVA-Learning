public class program
{
    public static void main(String[]args)
    {
        int n=5;
int arr[]={1,2,3,4,5};
for(int i=0;i<n-1;i+=2)
{
    arr[i]=arr[i]^arr[i+1];
    arr[i+1]=arr[i]^arr[i+1];
    arr[i]=arr[i]^arr[i+1];
}
for(int k=0;k<5;k++){
    System.out.println(arr[k]);
}
}
}

OUTPUT:
java -cp /tmp/rKoem9XXKx/program
2
1
4
3
5

=== Code Execution Successful ===
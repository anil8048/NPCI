import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	   long  arr[] = new long[n];
	    arr[0]=0;
	    arr[1]=1;
	    for(int i=2;i<n;i++)
	    {
	        arr[i]=arr[i-2]+arr[i-1];
	    }
	    for(int i=n-1;i>=0;i--)
	    {
	        System.out.print(arr[i]+" ");
	    }
	 
	}
}

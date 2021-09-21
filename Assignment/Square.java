import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int first,second;
	    first=sc.nextInt();
	    second=sc.nextInt();
	    System.out.println("First Value is:"+ first);
	    System.out.println("Second Value is:"+ second);
	    if(second%first ==0 && first*first== second)
	    {
	        System.out.println(second+"is a square & multiple of "+first);
	    }
	    else if(second%first ==0)
	    {
	        System.out.println(second +"is a mutiple of "+first+"="+second/first+"s of "+ first);
	    }
	    else
	    {
	        System.out.println(second +"is neither square nor multiple of "+first);
	    }
	//	System.out.println("Hello World");
	}
}

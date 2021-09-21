/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num,cnt=0;
	    num=sc.nextInt();
	    if(num<2)
	    {
	        System.out.println(num);
	    }
	    else
	    {
	        while(num!=0)
	        {
	            num=num/10;
	            cnt++;
	        }
	        if(cnt% 2==0)
	        {
	            System.out.println(cnt+","+cnt*cnt);
	        }
	        else if(cnt%3==0)
	        {
	            System.out.println(cnt+","+cnt*cnt*cnt);
	        }
	        else
	        {
	            System.out.println(cnt+"["+ (cnt-1)+"],"+(cnt-1)*(cnt-1));
	        }
	    }
	    
	}
}

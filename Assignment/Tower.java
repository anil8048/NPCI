import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int a = s.nextInt();
        int b = s.nextInt();
        int arr[] = new int[b];
        arr[0] = a;
        int p = 1;
        int sum;
        for(int i = 0; i < b; i++)
        {
    
            sum = 0;
            if(i == 0)
            {
                p = 1;
            }
            else
            {
                p = arr[i - 1];
            }
            for(int k = 0; k < b - (i + 1); k++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print(arr[i] + " ");
                sum += arr[i];  
            }
            if((i + 1) < b)
            {
                if(i != 0)
                    arr[i] = sum + arr[i - 1];
                else
                    arr[i] = sum;
                arr[i + 1] = sum + p;
            }
            System.out.println();
        }
	}
}

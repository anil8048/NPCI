public class Main
{
	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		int count=0;
		for(int i=0;i<2;i++)
		{
		    if(i%2==0)
		    {
		        for(int j=0;j<3;j++)
		        {
		            count++;
		            arr[i][j]=count;
		        }
		    }
		    else
		    {
		        for(int j=2;j>=0;j--)
		        {
		            count++;
		            arr[i][j]=count;
		        }
		    }
		}
		for(int i=0;i<2;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

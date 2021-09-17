public class Position
{
    static void firstoccurence(int arr[],int k)
		{
		     int res=-1;
		     for(int i=0;i<arr.length;i++)
		     {
		        if(arr[i]==k)
		        {
		           res=i;
		           break;
		        }
		     }
		     System.out.println(res);
		}
		static void alloccurence(int arr[],int k)
		{
		    boolean flag=false;
		    int res=-1;
		    for(int i=0;i<arr.length;i++)
		    {
		        if(arr[i]==k)
		        {
		            res=i;
		            flag=true;
		        }
		        if(flag)
		        {
		            System.out.print(res+" ");
		            flag=false;
		        }
	    	}
		}
	public static void main(String[] args) {
	   	int arr[]={1,5,5,8,9};
		int k=5;
		firstoccurence(arr,k);
		alloccurence(arr,k);
		
	}
}

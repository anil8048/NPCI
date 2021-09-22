import java.util.*;
public class Main
{
    static boolean isIdentical(int mat1[][],int mat2[][])
    {
	    if(mat1.length!=mat2.length ||mat1[0].length!=mat2[0].length)
	    {
	      return false;  
	    }
	    for(int i=0;i<mat1.length;i++)
	    {
	        for(int j=0;j<mat1[0].length;j++)
	        {
	            if(mat1[i][j]!=mat2[i][j])
	            {
	                return false;
	            }
	        }
	    }
	  return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int mat1[][]={{1,2,5},{3,-2,2}};
	    int mat2[][]={{1,2,6},{3,-2,5}};
	    int mat3[][]=new int [2][3];
	    if(isIdentical(mat1,mat2))
	    {
	        System.out.println("Matrices are Identical");
	    }
	    else
	    {
    	    for(int i=0;i<mat1.length;i++)
    	    {
    	        for(int j=0;j<mat1[0].length;j++)
    	        {
    	            if(mat1[i][j]==mat2[i][j])
    	            {
    	                mat3[i][j]=0;
    	            }
    	            else
    	            {
    	                mat3[i][j]=mat1[i][j];
    	            }
    	        }
    	    }
    	    for(int i=0;i<mat3.length;i++)
    	    {
    	        for(int j=0;j<mat3[0].length;j++)
    	        {
    	            System.out.print(mat3[i][j]+" ");
    	        }
    	    System.out.println();
    	    }
	    }
	    
	}
}


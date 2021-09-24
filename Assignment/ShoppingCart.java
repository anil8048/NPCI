import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    List<String> li = new ArrayList();
	    List<String> cart =new ArrayList();
	    li.add("Cooker");
	    li.add("fridge");
	    li.add("Washingmachine");
	    li.add("Cooker");
	    li.add("fridge");
	    li.add("oven");
	    li.add("kettle");
	    System.out.println("Available Products are:");
	    for(String s:li)
	    {
	        System.out.println(s);
	    }
	    String [] products = new String[3];
	    for(int i=0;i<3;i++)
	    {
	        System.out.println("enter the product:");
	        products[i]=sc.nextLine();
	        if(li.contains(products[i]))
	        {
	            cart.add(products[i]);
	            li.remove(products[i]);
	            System.out.println("Added to the Cart");
	        }
	        else
	        {
	            System.out.println("Product out of stock");
	        }
	    }
	    System.out.println("Your cart has:");
	    for(String s:cart)
	    {
	        System.out.println(s);
	    }
		
	}
}

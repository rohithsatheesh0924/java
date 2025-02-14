
import java.util.Arrays;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<Integer> list1 = new  ArrayList<>();
		for (int i =1;i<=10;i++){
		    list1.add(i);
		    System.out.println(list1.get(i-1));
		 		}
		 		int target=5;
		 		if(target==5)
		 		{
		 		System.out.println("The target value:" + target);
		 		}
		 		else{
		 		    System.out.println("false");
		 		}
		int sum=0;
		int product=1;
		for(int i=1;i<=10;i++){
		    sum=sum+i;
		    product=product*i;
		   	}
		   	System.out.println("the sum is " + "" +sum);	
		   	System.out.println("the product is " +"" + product);
		

	}
}

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		
		List<Integer> list1 = new  ArrayList<>(Arrays.asList(1,2,3,2,3,4,4,5));
		List<Integer> unilist = new  ArrayList<>();
		for(Integer num:list1){
		    if (!unilist.contains(num)) {
                unilist.add(num);
            }
		}System.out.println(unilist);
		
	
	}
}
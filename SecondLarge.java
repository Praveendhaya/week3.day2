package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SecondLarge {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		int length=data.length;
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < data.length; i++) 
			set.add(data[i]);
		System.out.println("second large is "+data[length-1]);
	}

}


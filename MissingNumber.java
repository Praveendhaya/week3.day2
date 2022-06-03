package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
	  int[] num= {4,6,7,2,3,1,9,10,8,8,7,6,2};
	 
		Set<Integer> set = new TreeSet<Integer>();
		for (Integer each : num) {
			set.add(each);
		}
		System.out.println(set);
		List<Integer> list = new ArrayList<Integer>(set);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)+1!=list.get(i+1)) {
				System.out.println(list.get(i)+1);
				break;
			}
		}

}

}

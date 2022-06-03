package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] a= {20,11,13,11,15,14,18,16,17,19,18,17,20};
		int len=a.length;
		int count;
		Set<Integer> set=new TreeSet<Integer>();
		for (int i = 0; i <len-1; i++) {
			set.add(a[i]);
			count=0;
			for (int j = i+1; j <len; j++) {
				if(a[i]==a[j])
				{
					count++;
					
				}
			}
		if(count>0) {
			System.out.println("duplicates are "+a[i]);
		}	
		}

	}

}

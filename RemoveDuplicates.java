package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	String input="We learnt java basics as part of java basic session in java week1";
	String[] split=input.split(" ");
	Set<String> a = new LinkedHashSet<String>();
	
	for (String b: split)
	{
		a.add(b);
	}
	System.out.println(a);
	}

}



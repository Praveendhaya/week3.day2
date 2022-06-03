package week3.day2;


	import java.util.HashSet;
	import java.util.Set;

	public class UniqueChar {

		public static void main(String[] args) {
			String input="praveen";
			char[] a=input.toCharArray();
			Set<Character> set=new HashSet<Character>();
			for(int i=0;i<a.length;i++)
			{
				if(!set.add(a[i]))
				{
					set.remove(a[i]);
				}
			}
			System.out.println(set);
			
		}

	}


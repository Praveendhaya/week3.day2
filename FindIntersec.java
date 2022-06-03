package week3.day2;


	import java.util.HashSet;
	import java.util.Set;


	public class FindIntersec {

		public static void main(String[] args) {
			int[] a= {5,9,10,4,6,7};
			int[] b= {2,5,8,4,9,7};
			Set<Integer> set=new HashSet<Integer>();
			for (int i = 0; i < a.length; i++) 
				set.add(a[i]);
			
			Set<Integer> set1=new HashSet<Integer>();
				for (int j = 0; j < b.length; j++) 
					set1.add(b[j]);
				
					if (set.retainAll(set1)) {
						System.out.println("intersection of 2 set is "+set);
					} 

					
				
			}

		}


package week3.day2;


	import java.util.Arrays;
	import java.util.Set;
	import java.util.TreeSet;

	public class MissingElement {

		public static void main(String[] args) {
			int[] a= {1,2,3,4,7,8,6};
			int len=a.length;
			Arrays.sort(a);
			Set<Integer> set=new TreeSet<Integer>();
			for (int i = 0; i < len; i++) {
				set.add(a[i]);
				if(i!=a[i+1]) {
					System.out.println("the missing element is "+i);
				}
			}

		}
}

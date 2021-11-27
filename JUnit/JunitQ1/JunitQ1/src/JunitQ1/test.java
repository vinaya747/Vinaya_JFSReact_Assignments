package JunitQ1;

public class test {

	public static void main(String[] args) {
		
		 MinMaxFinder obj = new MinMaxFinder();
         
         int[] a =  obj.findMinMax(new int[] {1,3,4,5,7});
         
         System.out.println(a[1]);
	}

}

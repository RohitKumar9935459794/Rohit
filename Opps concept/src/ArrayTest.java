
public class ArrayTest   {
	
		public static void main(String args[]) {
	
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i]);
		}
		System.out.println();
		float sum=0 ;
		float avg;
		for( int i =0;i<arr.length;i++) {
			sum += arr[i];
			avg = sum/arr.length;
			System.out.println(" ArrSum"+avg);
		}
	
	
	}

}

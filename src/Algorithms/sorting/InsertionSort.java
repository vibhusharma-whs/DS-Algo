package sorting;

class InsertionSort {
	
	public static void main(String[] args) {
		
		int a[] = {2,4,1,6,8,5,3,7};
		long start = System.nanoTime();
		// some time passes
		
		
		for (int i = 1;i<a.length;i++) {
			
			int j = i-1;
			int temp = a[i];
			
			while (j>=0 && a[j] > temp) {
				
				a[j+1] = a[j];
				j = j -1;
				
			}
			
			a[j+1] = temp;
		}
		long end = System.nanoTime();;
		long elapsedTime = end - start;
		System.out.println(elapsedTime);
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		
		}
	}
	
}
				
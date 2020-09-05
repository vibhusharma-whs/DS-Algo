package sorting;

class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,1,6,8,5,3,7};
		long start = System.nanoTime(); //calculation of time taken
		InsertionSort.sort(arr);
		long end = System.nanoTime();
		long elapsedTime = end - start;
		System.out.println("Time taken by algo - "+elapsedTime+" nano seconds");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int[] a) {
		
		if(a.length<2) return;
		for(int i = 1;i<a.length;i++) {
			int temp = a[i];
			int j = i-1;
			
			while(j>=0 && a[j] > temp) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
	
}
				
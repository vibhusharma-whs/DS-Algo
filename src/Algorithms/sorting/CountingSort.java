package sorting;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5,4,1,6,-5,-4,-3,20,13,64,9,-13,0};
		long start = System.nanoTime(); //calculation of time taken
		CountingSort.sort(arr, -13, 64);
		long end = System.nanoTime();
		long elapsedTime = end - start;
		System.out.println("Time taken by algo - "+elapsedTime+" nano seconds");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int[] a, int min, int max) {
		int size = max-min+1;
		int freq[] = new int[size];
		
		for(int i = 0;i<a.length;i++) {
			freq[a[i]-min]++;
		}
		int j = 0;
		for(int i = 0;i<size;i++) {
			while(freq[i] > 0 && j<a.length) {
				a[j] = i+min;
				freq[i]--;
				j++;
			}
		}
	}

}

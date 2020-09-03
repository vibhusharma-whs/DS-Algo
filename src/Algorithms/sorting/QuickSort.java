package sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort ab = new QuickSort();
		int[] arr = {2,1,3};
		ab.sort(arr, 0, 2);
		for(int i:arr) {
			System.out.print(i+" , ");
		}

	}
	
	int partition(int[] a, int start, int end) {
		
		int pivot = a[end];
		int idx = start;
		
		for(int i = start; i< end;i++) {
			if(a[i]<pivot) {
				int temp = a[i];
				a[i] = a[idx];
				a[idx] = temp;
				idx++;
			}
		}
		
		int temp = a[idx];
		a[idx] = a[end];
		a[end] = temp;
		return idx;
	}
	
	void sort(int[] a, int start, int end) {
		if (start < end) {
			int partition = partition(a, start, end);
			sort(a, start, partition-1);
			sort(a, partition+1, end);
		}
	}

}

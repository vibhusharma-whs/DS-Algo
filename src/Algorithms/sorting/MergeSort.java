package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,1,6,8,5,3,7};
		long start = System.nanoTime();
		MergeSort.sort(arr);
		long end = System.nanoTime();
		long elapsedTime = end - start;
		System.out.println(elapsedTime);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void sort(int[] a) {
		if(a.length <2) return;
		int middle = a.length/2;
		int[] left = new int[middle];
		int[] right = new int[a.length-middle];
		
		for(int i=0;i<middle;i++) {
			left[i] = a[i];
		}
		for(int j=middle;j<a.length;j++) {
			right[j-middle] = a[j];
		}
//		for(int m = 0;m<left.length;m++) {
//			System.out.print(left[m]);
//		}
//		System.out.println("LEFT");
//		for(int m = 0;m<right.length;m++) {
//			System.out.print(right[m]);
//		}
//		System.out.println("RIGHT");
		sort(left);
		sort(right);
		merge(left, right, a);
	}
	
	public static void merge(int[] l, int[] r, int[] a) {
		
		int i=0;
		int j = 0;
		int k = 0;
		
		while(i<l.length && j<r.length) {
			if(l[i] <= r[j]) {
				a[k] = l[i];
				i++;
			}
			else {
				a[k] = r[j];
				j++;
			}
			k++;
		}
		while(i<l.length) {
			a[k] = l[i];
			i++;
			k++;
		}
		while (j<r.length) {
			a[k] = r[j];
			j++;
			k++;
		}
		
	}

}

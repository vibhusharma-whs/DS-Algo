package sorting;

class InsertionSort {
	
	public static void main(String[] args) {
		
		int a[] = {36,19,29,12,5};
		
		for (int i = 1;i<a.length;i++) {
			
			int j = i-1;
			int temp = a[i];
			
			while (j>=0 && a[j] > temp) {
				
				a[j+1] = a[j];
				j = j -1;
				
			}
			
			a[j+1] = temp;
		}
		
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		
		}
	}
	
}
				
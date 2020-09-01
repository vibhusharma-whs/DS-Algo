package sorting;

class BubbleSort {
	
	public static void main( String[] args ) {
		
		int temp;
		
		int[] input = {29, 12, 36, 5, 2, 103, 27, 89};
		
		for (int i=0;i<input.length;i++) {
			
			int flag = 0;
			
			for (int j=0;j<input.length-1-i;j++) {
				
				if (input[j]>input[j+1]) {
					
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
					flag = 1;				
				
				}
				
			}
			if  (flag == 0) {
				break;
			}
		}
		
		for (int i = 0;i<input.length;i++) {
			System.out.print(input[i]+", ");
		}
	}
}
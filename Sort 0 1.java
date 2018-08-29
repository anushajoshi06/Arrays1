public class SortBinaryArray{	

	public static void sortBinaryArray(int[] arr){
		

      int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			
			while(arr[low] == 0 && low < high)
				low ++;
			
			
			while(arr[high] == 1 && low < high)
				high--;
			
			if(low < high) {
				
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low ++;
				high--;
			}
		}
		return;
    
	}
}
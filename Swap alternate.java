/*Sample Input 1:
6
9 3 6 12 4 32
Sample Output 2 :
3 9 12 6 32 4*/
public class Solution {

	
	public static void swapAlternate(int[] input){
		
					
 
      for (int i = 0; i < input.length - 1; i += 2) {
        int c = input[i] + input[i + 1];
        input[i] = c - input[i];
        input[i + 1] = c - input[i + 1];
    }
	}
	
}

import java.util.Scanner;
public class Solution {

	
	public static int findDifference(int[] input){

		
      
      int even=0,odd=0,find=0,i;
    
   for(i=0;i<input.length;i++) 
   {
     if(i%2==0)
     {
    	 even=even+input[i];
     }
     else{
    	 odd=odd+input[i];
         }
   }
   
      find=(even-odd);
 
 return find;  
}
}


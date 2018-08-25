/*Sample Input 1 :
6
Sample Output 1 :
 1 3 5 6 4 2*/
public class Solution {

	
	public static int[] arrange(int n){
		
					
int i,m=0,x=0;
   int arrange[]=new int[n];
       int arrange2[]=new int[n];
   for(i=1;i<=n;i++) 
   {
     if(i%2!=0)
     {
    	 arrange[m]=i;
       m++;
     }
     else{
     arrange2[x]=i;
       x++;
    	 
         }
   
     // arrange[=(odd," ",even);
   }
      for(i=x-1;i>=0;i--){
        arrange[m]=arrange2[i];
      //  m++;
        if(m==n){
          break;
        }
        m++;
      }
      return(arrange);
	}
	
}
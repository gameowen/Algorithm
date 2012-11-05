import java.util.Arrays;

public class frequence{
    
    public void oddFrequence(int[] a){

       Arrays.sort(a);
       int c = 1;
       int m = 1;
       	 for(int i = 0; i < a.length - 1; i++){
       		 if(a[i] != a[i+1] ){
       			 if( c % 2 != 0){
       				 System.out.print(a[i]);
           			 
       			 }
       			 c = 1;
       			 
       		 }
       		 if(a[i] == a[i+1]){
       			 
       			 c++;
       		 }
       			 
       		 
       	 }
       	 for(int i = 2; i < a.length; i++){
       		 
       		 if(a[a.length-1]== a[a.length -i]){
        		 m++;
        	 }
       		
       	 }
       	 if(m % 2 !=0){
    			System.out.print(a[a.length-1]);
    		 }
    	   
       }
   
    
    public static void main(String[] args){         
         int[] a = {1,2,2,2,3,3,4,5,55,55,5,6,6,6,6};
         frequence f = new frequence();
         f.oddFrequence(a);
    }
}




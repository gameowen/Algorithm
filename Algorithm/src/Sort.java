
public class Sort {
	public void bubbleSort(int[] a){
		for(int i = 0; i < a.length -1; i++){
			for(int j = i; j < a.length-1; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public void selectSort(int[] a){
		int min;
		for(int i = 0; i < a.length - 1; i++){
			 min = i;
			 for(int j = i + 1; j < a.length; j++){
				 if(a[j] < a[min]){
					 min = j;
				 }
			 }
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
	public void insertionSort(int[] a){
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j = i;
			while(j > 0 && a[j-1] >= temp ){
				a[j] = a[j-1];
				--j;
			}
			a[j] = temp;
		}
	}
	public static void  main(String[] args){
		Sort s = new Sort();
		int[] a={1,2,6,5,4,3};
		//s.bubbleSort(a);
		//s.selectSort(a);
		s.insertionSort(a);
		for(int k:a){
			System.out.print(k);
		}
	}	
}

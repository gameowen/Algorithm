
public class DataStructure {
	//Array--int value 
	class lowArray{
		private int[] a;
		
		public lowArray(int size){
			a = new int[size];
		}
		public void setElem(int index, int value){
			a[index] = value;
		}
		public int getElem(int index){
			return a[index];
		}
	}
	class highArray{
		private int[] a;
		private int cElems;
		public highArray(int Max){
			a = new int[Max];
			cElems = 0;
		}
		public boolean find(int searchKey){
			int j;
			for(j=0; j < cElems; j++){
				if(a[j] == searchKey){
					break;
				}
			
			}
			if(j == cElems){
				return false;
			}
			else
				return true;
		}
		public void insert(int value){
			a[cElems] = value;
			cElems++;
		}
		public boolean delete(int value){
			int j;
			for(j = 0; j < cElems; j++){
				if(value == a[j]){
					break;
				}
				
				}
			if(j == cElems)
				return false;
			else{
				for(int k = j; k < cElems; k++){
					a[k] = a[k+1];
				}
				cElems--;
				return true;	
			}
		}
		public void display(){
			for(int j = 0; j < cElems; j++){
				System.out.print(a[j] + " ");				
			}
			System.out.println("");
		}
	}
}

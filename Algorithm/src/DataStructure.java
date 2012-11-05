
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
	class Stack {
		private int size;
		private int[] stackArray;
		private int top;
		
		public Stack(int s){
			size = s;
			stackArray = new int[size];
			top = -1;
		}
		public void push(int k){
			stackArray[++top] = k;
		}
		public int pop(){
			return stackArray[top--];
		}
		public int peek(){
			return stackArray[top];
		}
		public boolean isEmpty(){
			return(top == -1);
		}
		public boolean isFull(){
			return(top == size - 1);
		}
	}
	class Queue{
		private int size;
		private int[] queueArray;
		private int front;
		private int rear;
		private int cItems;
		public Queue(int q){
			size = q;
			queueArray = new int[size];
			front = 0;
			rear = -1;
			cItems = 0;
		}
		public void insert(int k){
			if(rear == size - 1){
				rear = -1;
			}
			queueArray[++rear] = k;
			cItems++;
		}
		public int remove(){
			int temp = queueArray[front++];
			if(front == size){
				front = 0;
			}
			cItems--;
			return temp;
		}
		public int peekFront(){
			return queueArray[front];
		}
		public boolean isEmpty(){
			return(cItems == 0);
		}
		public boolean isFull(){
			return(cItems == size);
		}
		public int queueSize(){
			return cItems;
		}
	}	
}

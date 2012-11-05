
/*class Stack {
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
	public static void main(String[] args){
		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while(!stack.isEmpty()){
			int value = stack.pop();
			System.out.print(value);
		}
	}
}*/
//wraparound queue
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
	public static void main(String[] args){
		Queue queue = new Queue(5);
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		
		queue.remove();
		queue.remove();
		queue.remove();
		
		queue.insert(5);
		queue.insert(6);
		queue.insert(7);
		queue.insert(8);

		while(!queue.isEmpty()){
			int value = queue.remove();
			System.out.print(value);
		}
	}
}

class Link{
	public int data;
	public Link next;
}
public class kthLinkedList{
	public Link first;
	public int size;
	public kthLinkedList(){
		first = null;
		size = 0;
	}
	public void insert(int value){
		Link node = new Link();
		node.data = value;
		node.next = first;
		first = node;
		size++;
		
	}
	public int size(){
		return size;
	}
	public int findKth(int k){
		Link m = first;
		Link n = first;
		if(k > size()||k < 0){
			try {  
                throw new IndexOutOfBoundsException();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
		}
		else{
			for(int i = 0; i < k-1; i++){
				n = n.next;
			}
			while(n.next != null){
				m = m.next;
				n = n.next;
			}
			
		}
		return m.data;	
	}
	
	public void display() {  
        Link node = first;  
        while (node != null) {  
            System.out.print(node.data + " ");  
            node = node.next;  
        }  
        System.out.println();  
    }  
	
	public static void main(String[] args){
		kthLinkedList l = new kthLinkedList();
		for(int i=0; i < 10; i++){
			int value = (int) (Math.random() * 100);  
            l.insert(value);  
		}
		l.display();
		System.out.print(l.findKth(4));
	}
}
	
	
	

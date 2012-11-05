import java.util.ArrayList;
import java.util.List;


public class CommonElem {
	public  void CommmonElem(List l1, List l2){
		if(l1.size() >= l2.size()){
			for(int i = 0; i < l1.size(); i++){
				for(int j = 0; j < l2.size(); j++){
					if(l1.get(i) == l2.get(j)){
						System.out.print(l1.get(i));
						l1.remove(i);
						l2.remove(j);
					}
					
				}
			}
		}
		else{
			for(int j = 0; j < l2.size(); j++){
				for(int i = 0; i < l1.size(); i++){
					if(l1.get(i) == l2.get(j)){
						System.out.print(l2.get(j));
						l1.remove(i);
						l2.remove(j);
					}
					
				}
			}
		}
	}
	public static void  main(String args[]){
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l2.add(3);
		l2.add(5);
		l2.add(4);
		l2.add(8);
		
		CommonElem ce = new CommonElem();
		ce.CommmonElem(l1, l2);
	}
}

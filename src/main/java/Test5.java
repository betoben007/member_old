import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class Test5 {

	public static void main(String[] args) {
		
		
		
		
		HashSet<Integer> a = new HashSet<Integer>();
		
		
		while(true){
			if(a.size() == 10) {
				break;
			}
			
			int num = (int)(Math.random()*5)+1;
			a.add(num);
		}
			
		
		Iterator<Integer> a1 = a.iterator();
		
		while(a1.hasNext()){
			System.out.print(a1.next()+ "  ");
		}
		
		
		
		
	}
	
}

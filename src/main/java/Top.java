
import java.lang.Runnable;

public class Top implements Runnable{
	@Override
	public void run() {

		for(int i = 0; i<=49; i++){
			System.out.print(i +"\t");
			
			if(i%10==9) System.out.println();
		}
	}
	
}

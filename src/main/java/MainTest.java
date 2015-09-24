
public class MainTest {

	public static Bank bank = new Bank();
	
	public static void main(String[] args) {

		while(true) {
		
			Menu menu = new Menu();
			
			int a = menu.Message();
		
			if(a == 3) {
				break;
			}			
		
		}
	}

}

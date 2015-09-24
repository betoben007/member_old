import java.util.Scanner;


public class SaveMoney extends Thread implements Runnable {
	
	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금할 금액을 입력하세요: ");
		
		int a = sc.nextInt();
		sc.nextLine();
		
		MainTest.bank.saveMoney(a);
	
	}
}

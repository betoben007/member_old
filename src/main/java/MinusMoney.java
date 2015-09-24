import java.util.Scanner;


public class MinusMoney extends Thread implements Runnable {
	
	@Override
	public void run() {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금하실 금액을 입력해 주세요: ");
		
		int a = sc.nextInt();
		sc.nextLine();
		
		MainTest.bank.minusMoney(a);
	
	}
}

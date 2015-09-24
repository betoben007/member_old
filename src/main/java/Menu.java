import java.util.Scanner;


public class Menu{

	public int Message() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입금 2. 출금 3. 종료");
		System.out.print("수행하실 작업을 선택해 주세요: ");
		
		int a = sc.nextInt();
		sc.nextLine();
		
		switch (a) {
		case 1:
			SaveMoney save = new SaveMoney();
			save.start();
			
			break;
		case 2:
			MinusMoney minus = new MinusMoney();
			minus.start();
			
			break;
		case 3:
			break;
		default:
			System.out.println("잘못입력하셨습니다. 다시입력해주세요.");
			break;
		}
			
		return a;
		
	}
	
	
	
	
	
	
	
}
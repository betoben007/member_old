
public class Bank {

	private int money = 1000;
	
	public synchronized void saveMoney(int money) {
		
		System.out.println(money+ "를 입금하셨습니다.");
		
		setMoney(money + money);
	}
	
	public synchronized void minusMoney(int money) {
		System.out.println(money+ "를 출금하셨습니다.");
		
		setMoney(this.money - money);
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		System.out.println(money);
		return this.money;
	}
}

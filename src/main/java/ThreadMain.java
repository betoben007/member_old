
public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("스레드 시작");
		
		Top t = new Top();
		Thread t1 = new Thread(t);
		t1.run();
		
		System.out.println("스레스 종료");
	}
	
}

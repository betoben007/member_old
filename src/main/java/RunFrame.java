import java.awt.Frame;


public class RunFrame extends Frame implements Runnable{

	@Override
	public void run() {

		int i = 0;
		System.out.println("스레스 시작");
		
		while(i<10){
			System.out.print(i+ "\t");
			this.setTitle("스레드 동작중"+ i++);
		}
		
		
		try{
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			System.out.println(e);
		} 
	System.out.println("스레드 종료");
	
	}

}



import java.io.IOException;


public class RunFrameMain {

	public static void main(String[] args) throws IOException {
		RunFrame r = new RunFrame();
		
//		r.run();
		
		r.setSize(300, 100);
		r.setVisible(true);
		
		Thread t = new Thread(r);
		t.start();
		
		int a = System.in.read();
		
		System.out.println(a);
	
	}
}
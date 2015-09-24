import java.io.IOException;

public class FinalManMain {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("프로그램 시작");
		{
			FinalMain fm = new FinalMain("finalize.dat");
			fm.writeData("안녕하세요");
			fm.writeData("hello");
			fm = null;
		}
		
		System.gc();
		System.out.println("프로그램 종료");
		
	}
	
	

	
	
	
	
}

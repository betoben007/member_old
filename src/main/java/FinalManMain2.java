import java.io.FileWriter;
import java.io.IOException;


class FinalMan{
	
	private FileWriter fr = null;
	
	public FinalMan(String filename) throws IOException {
		fr= new FileWriter(filename);
	}
	
	public void writerData(String str) throws IOException {
		this.fr.write(str);
	}
	
	protected void finalize() throws Throwable {
		Thread t = Thread.currentThread();
	
		System.out.println("finalize()의 스레드: "+ t);
		if(fr == null) {
			fr.close();
		}
		
		System.out.println("finalize()의 파일 닫기");
		super.finalize();
	}
	
	
	
}

public class FinalManMain2 {

	public static void main(String[] args) throws IOException {
		System.out.println("프로그램 시작");
		{
			FinalMan fm = new FinalMan("finalize.dat");
			fm.writerData("안녕하세요");
			fm.writerData("hello");
			fm = null;
		}
	
		Thread t = Thread.currentThread();
		System.out.println("main()의 스레드: "+ t);
		System.gc();
		System.out.println("프로그램 종료");
	
	}
	
}

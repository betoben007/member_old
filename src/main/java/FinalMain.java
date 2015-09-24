import java.io.FileWriter;
import java.io.IOException;


public class FinalMain {
	private FileWriter fw = null;
	
	public FinalMain(String filename) throws IOException{
		this.fw = new FileWriter(filename);
	}
	
	public void writeData(String str) throws IOException {
		this.fw.write(str);
		this.fw.flush();
	}
	
	protected void finalize() throws Throwable {
		if(this.fw != null){
			this.fw.close();
		}
		
		System.out.println("finalize()의 파일 닫기");
		super.finalize();
	}
	
	
	
}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class ByteToCharMain {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		InputStreamReader isr = new InputStreamReader(fin);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		int i;
		while((i=isr.read()) != -1) {
			osw.write(i);
		}
		
		osw.close();
		isr.close();
		
		System.out.println("작업완료");
		
		
	}
	
	
	
	
}

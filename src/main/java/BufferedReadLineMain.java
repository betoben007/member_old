import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class BufferedReadLineMain {

	public static void main(String[] args) throws IOException {
		
		int i, len=0;
		
		InputStream in  = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String temp;
		
		if((temp=br.readLine()) != null){
			System.out.println(temp);
		}
		
	}
}

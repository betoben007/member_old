import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReadLineMain2 {

	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(in);
		
		String temp;
		
		while((temp=br.readLine()) != null) {
			System.out.println(temp);
		}
		
		br.close();
	}
}

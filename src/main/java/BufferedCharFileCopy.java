import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedCharFileCopy {

	public static void main(String[] args) throws IOException {
		int i, len = 0;
		
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter(args[1]);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		long psecond = System.currentTimeMillis();
		
		while((i=br.read()) != -1) {
			bw.write(i);
			len++;
		}
		
		psecond = System.currentTimeMillis() - psecond;
		
		System.out.println(len + "byte, "+ psecond + "miliseconds");
		
	}

}

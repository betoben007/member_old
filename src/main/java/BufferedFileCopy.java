import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedFileCopy {

	public static void main(String[] args) throws IOException {

		int i, len = 0;
		
		FileInputStream fis = new FileInputStream(args[0]);
		FileOutputStream fos = new FileOutputStream(args[1]);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long psecond = System.currentTimeMillis();
		
		while((i=fis.read()) != -1) {
			
			fos.write(i);
			len++;
		}
		
		bis.close();
		bos.close();

		psecond = System.currentTimeMillis() - psecond;
		
		System.out.println(len +"byte, "+ psecond +"miliseconds");
	}

}

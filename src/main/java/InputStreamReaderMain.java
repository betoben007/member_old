import java.io.IOException;
import java.io.InputStreamReader;


public class InputStreamReaderMain {

	public static void main(String[] args) throws IOException {

		int i;
		
		InputStreamReader isr= new InputStreamReader(System.in);
		
		System.out.println("종료하기 위해서는 '끝'을 입력하시오");
		System.out.println("출력할 데이터를 입력하시오: ");
		
		while((i=isr.read()) != '끝') {
			System.out.print((char)i);
		}
		
		isr.close();
		
	}

}

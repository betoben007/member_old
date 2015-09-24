import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SampleDataMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		SampleData s1 = new SampleData("홍길동", 1104);
		SampleData s2 = new SampleData("김삿갓", 1105);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		
		oos.close();
		
		System.out.println(s1 + ":" + s1.getSampleData());
		System.out.println(s2 + ":" + s2.getSampleData());
	
		FileInputStream fis = new FileInputStream("serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SampleData sd1 = (SampleData) ois.readObject();
		SampleData sd2 = (SampleData) ois.readObject();
	
		ois.close();
		
		System.out.println(sd1 +":"+ sd1.getSampleData());
		System.out.println(sd2 +":"+ sd2.getSampleData());
	}
}

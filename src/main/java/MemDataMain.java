import java.io.IOException;


public class MemDataMain {

	public static void main(String[] args) throws IOException {
		
		MemData m = new MemData();
		m.setMemData(100, 2000000, 3.14159F);
		
		System.out.println(m.toString() +" : "+ m.getMemData());
		m.saveMemData("memdata.dat");
		
		MemData r = MemData.restoreMemData("memdata.dat");
		System.out.println(r.toString() +" : "+ r.getMemData());
	}
}

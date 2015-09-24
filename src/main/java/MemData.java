import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class MemData {
	private int id;
	private long type;
	private float weigth;
	
	public void setMemData(int id, long type, float weigth){
		this.id = id;
		this.type = type;
		this.weigth = weigth;
	}
	
	public String getMemData() {
		return id +", "+ type +", "+ weigth;
	}
	
	public void saveMemData(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("MemData\n");
		bw.write(id +"\n");
		bw.write(type +"\n");
		bw.write(weigth +"\n");
		bw.close();
	}
	
	public static MemData restoreMemData(String filename) throws IOException {
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String temp = br.readLine();
		MemData memObj = new MemData();
		if(temp.equals("MemData")){
			int i = Integer.parseInt(br.readLine());
			long t = Long.parseLong(br.readLine());
			float w = Float.parseFloat(br.readLine());
			memObj.setMemData(i, t, w);
		}
		
		br.close();
		return memObj;
		
		
		
		
	}
	
}

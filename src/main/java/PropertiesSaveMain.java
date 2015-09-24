import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesSaveMain {
	public static void main(String[] args) throws IOException {
	
		Properties p = new Properties();
		
		p.put("driver", "com.mysql.jdbc.Driver");
		p.setProperty("url", "jdbc:mysql://localhost:3306/world");
		p.setProperty("maxconn", "10");
		p.setProperty("user", "jym");
		p.setProperty("password", "1234");
		
		FileOutputStream out = new FileOutputStream("jdbc.properties");
		p.store(out, "JDBC Config Setting");
		
		out.close();
		System.out.println("환경설정 파일 jdbc.properties 기록 완성");
		
		
	}
	
	
	
}

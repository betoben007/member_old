package hello;

public class HelloBean {

	private String name;
	
	public void setStatement(String name){
		this.name = name;
	}
	
	public String getStatement() {
		return "Hello" + name;
	}
}

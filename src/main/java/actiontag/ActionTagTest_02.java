package actiontag;

public class ActionTagTest_02 {

	private String str = "";
	private String id ="";
	
	public ActionTagTest_02() {}
	
	public ActionTagTest_02(String str, String id){
		this.str = str;
		this.id = id;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getStr() {
		return str;
	}
	
	public String getContent() {
		return id +" : "+ str;
	}
	
}

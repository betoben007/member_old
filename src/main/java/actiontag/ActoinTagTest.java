package actiontag;

public class ActoinTagTest {

		private String str = "";
		private String id = "";
		
		public ActoinTagTest() {}
		
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
			return id + " : "+ str;
		}
		
}

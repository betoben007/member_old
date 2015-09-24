
public class GameUnit {

	private int id;
	private String name;
	
	public GameUnit(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GameUnit) {
			GameUnit eo = (GameUnit) obj;
			return (this.id == eo.id);
		}
		
		return false;
	}
	
	public String toString() {
		return id +":"+ name;
	}
	
}

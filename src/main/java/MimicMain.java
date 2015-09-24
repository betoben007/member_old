
class Mimic extends Object implements Cloneable {
	private int id;
	private String name;
	
	public Mimic(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String toString() {
		return this.id +":"+ this.name;
	}
	
}


public class MimicMain{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Mimic m = new Mimic(1000, "호랑이");
		Mimic n = (Mimic)m.clone();
		
		System.out.println(m.hashCode() +" "+ m);
		System.out.println(n.hashCode() +" "+ n);
	
	}
		
}

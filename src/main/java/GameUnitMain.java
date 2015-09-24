
public class GameUnitMain {

	public static void main(String[] args) {
		GameUnit e1 = new GameUnit(1000, "Tank");
		GameUnit e2 = new GameUnit(1000, "Missile");
		
		System.out.println("e1: "+ e1);
		System.out.println("e2: "+ e2);
		System.out.println("e1.hashCode()"+ e1.hashCode());
		System.out.println("e2.hashCode()"+ e2.hashCode());
		System.out.println("e1==e2: "+ (e1==e2));
		System.out.println("e1.equals(e2): "+ e1.equals(e1));
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		Department depart = new Department();
		
		depart.addEmployee(new Permanent("KIM", 1000));
		depart.addEmployee(new Permanent("LEE", 1000));
		depart.addEmployee(new PartTime("PARK", 10, 200));
		depart.addEmployee(new PartTime("SONG", 10, 170));
		
		depart.ShowEmployee();
		
		
		
	}
}

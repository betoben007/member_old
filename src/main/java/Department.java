import java.util.Vector;


public class Department {

	private Vector v = new Vector();
	public void addEmployee(Employee e){
		
		this.v.add(e);
		
	}
	
	public void ShowEmployee() {
		
		for(int i=0; i<v.size(); i++) {
			Employee e = (Employee) v.elementAt(i);
			System.out.println(e.getName() +":"+ e.getPay());
		}
		
	}
	
}

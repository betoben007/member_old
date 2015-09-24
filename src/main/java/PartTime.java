
public class PartTime extends Employee{

	private int salary;
	private int time;
	
	public PartTime (String name, int salary, int time){
		super(name);
		this.salary = salary;
		this.time = time;
	}
	
	public int getPay(){
		return this.salary * this.time;
	}
}

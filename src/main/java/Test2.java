
public class Test2 {

	public static void main(String[] args) {
		
//		System.out.println(Test1.plus(200, 200) +" "+ Test1.plus(100, 200));
		
		
		Test1 t = new Test1();
		Test1 t1 = new Test1();
		
		
		int a3 = t.plus(100, 200);
		int a4 = t.plus(100, 400);
		
//		System.out.println(a3 +" "+ a4);
		
		t.a = 100;
		int a5 = t.a;
		
		System.out.println(a5);
		
		t1.a= 300;

		t.a = 300;
		 
		a5 = t.a;
		
		System.out.println(t.a +" "+ t1.a);
		
	}
}

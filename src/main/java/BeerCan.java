
public class BeerCan extends EmptyCan {

	@Override
	public void printContent() {

		System.out.println("흑맥주");
	}

	@Override
	public void printName() {
		
		System.out.println("맥주캔입니다");
	}

	public static void sayHello() {
		System.out.println("안녕하세요 맥주캔입니다.");
	}
	
	public static void main(String[] args) {
		
		BeerCan b = new BeerCan();
		b.printContent();
		b.printName();
		b.sayHello();
	}
	
}

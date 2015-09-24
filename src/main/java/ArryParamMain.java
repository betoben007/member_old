
public class ArryParamMain {
	public static void main(String[] args) {
	
		int[] source = {1, 2, 3, 4, 5};
		ArrayParam p = new ArrayParam();
		
		int[] target = new int[source.length];
		
		p.copyArray(source, target);
		
		for(int i=0; i<target.length; i++){
			System.out.println(target[i]);
		}
	
	}
	
}

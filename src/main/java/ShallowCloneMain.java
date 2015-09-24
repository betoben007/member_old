import java.util.Vector;

import oracle.net.aso.e;


public class ShallowCloneMain {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement(new String("Hello World"));
		v.addElement(new String("원본의 글"));
		
		Vector s = (Vector)v.clone();
		System.out.println(v.elementAt(0) == s.elementAt(0));
		System.out.println(v.elementAt(1) == s.elementAt(1));
	}
	
}

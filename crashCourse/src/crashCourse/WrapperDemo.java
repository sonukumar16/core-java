package crashCourse;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5; // primitive class
		//Integer ii = new Integer(5); //  wrapper class
		
		Integer ii = new Integer(i); //  Boxing- Wrapping
		
		int j= ii.intValue();	// Unboxing-unwrapping
		
		System.out.println("ii and j " +ii + j);
		
		Integer value = i; // Autoboxing
		
		int k = value; // Auto unboxing
		System.out.println("value of  k " +k);

	}

}

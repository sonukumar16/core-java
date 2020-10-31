package crashCourse;

class P {
	final int DAY =0;
	
	/*
	 * public A() { DAY=10; //here we can't assigned new value to DAY variable. }
	 */
 public final void show() {
 System.out.println("Show of class A is called");
 }
}

class Q extends P {
	
	/* we can't override final method
	 * public void show() { System.out.println("Show of class B is called"); }
	 */
}

final class R {
	
}


// we can't access R class because it's final class
class S extends R {
	
}


public class finalKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q b = new Q();
	}

}

/*
 * Three usage of final keyword
 * To make a variable constant.
 * To make a class no inheritable, means no one can extend that class
 * If make a method as a final then no any class can override that method. 
 * 
 */
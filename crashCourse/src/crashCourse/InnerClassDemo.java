package crashCourse;

class Outer {
	int a;
	public void show() {
		System.out.println("Show method is called");
	}
	// here only one purpose of Inner class is to use only inside the Outer class otherwise create outside
	class Inner {  // Outer$Inner.class will be inside src/class file 
		public void display() {
			System.out.println("Dispaly method is called");
		}
		
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.show();
		
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}

}

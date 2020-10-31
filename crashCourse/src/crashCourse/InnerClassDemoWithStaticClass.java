package crashCourse;

/*
 * Inner class has
 * 	Member Class
 *  Static Class
 *  Anonymous Class

*/class OuterClass  {
	static int a;
	public static void show() {
		System.out.println("Show method is called with static");
	}
	// here only one purpose of Inner class is to use only inside the Outer class otherwise create outside
	static class Inner {  // Outer$Inner.class will be inside src/class file 
		public void display() {
			System.out.println("Dispaly method is called with static");
		}
		
	}
}

public class InnerClassDemoWithStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass.show();
		
		OuterClass.Inner inner = new OuterClass.Inner();
		inner.display();
	}

}

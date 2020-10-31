package crashCourse;
 interface NewDemo {
	 void abc();
	 default void show() {
		 System.out.println("in new demo show");
	 }
 }
 
 interface MyDemo {
	  default void show() {
			System.out.println("in MyDemo show");
		}
 }

 class NewDemoImp implements NewDemo, MyDemo {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("in abc of newDemoImp class");
	}

	// show method in both interfaces so we have to override one of them to remove ambiguity problem.
	@Override
	public void show() {
		// TODO Auto-generated method stub
		NewDemo.super.show();
	}	
	 
 }


public class MultipleInheritancWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewDemo newDemo = new NewDemoImp();
		newDemo.abc();
		newDemo.show();
	}

}

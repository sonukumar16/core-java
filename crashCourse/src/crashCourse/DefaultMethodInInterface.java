package crashCourse;

/* Abstract class  -> Define and declare method
 * Interface -> declare -> 1.7
 * in java 1.8 define methods in interface
*/

@FunctionalInterface
interface Demo {
	void abc();
	default void show() {
		System.out.println("in default show method");
	}
}

class DemoImp implements Demo {

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("In override abc method ");
	}
	public void show() {
		System.out.println("in new show method");
	}
	
}
public class DefaultMethodInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new DemoImp();
		demo.abc();
		demo.show();
	}

}

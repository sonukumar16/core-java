package crashCourse;


class  A {
	public A() {
		System.out.println("In Side A Default constructor");
	}
	public A(int i) {
		System.out.println("In Side A Parameterise constructor " +i);
	}
}

class  B extends A {
	public B() {
		System.out.println("In Side B Default constructor");
	}
	public B(int i) {
		super(i);
		System.out.println("In Side B Parameterise constructor" +i);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(5);
	}

}

package crashCourse;

class C {
	public void show () {
		System.out.println("Classs C show method");
	}
}

class D extends C{
	@Override
	public void show () {
		System.out.println("Classs D show method");
	}
}


class E extends C {
	@Override
	public void show () {
		System.out.println("Classs E show method");
	}
}
public class MthodOverriding {
// compile time and run time ploymorphism
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();// run time 
		d.show();
		
		C c = new D();
		c.show();
		
		c = new E();
		c.show(); // Dynamic method dispatch
	}

}

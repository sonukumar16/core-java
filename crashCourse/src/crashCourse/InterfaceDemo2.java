package crashCourse;

interface Abc {
	void show();
}

class Implimentor implements Abc {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Anything");
	}
	
}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Abc abc = new Implimentor();
		abc.show();
	}

}

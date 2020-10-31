package crashCourse;

interface X {
	void abc();
	int i =10;
	static void show () {
		System.out.println("Static show method is called!");
	}
}



class Z implements X {
	
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("abc method of class P.");
		i=11; // here can't assigned new value because if you define any variable in an interface that will become final.
	}
	
}
public class StaticMethodInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X.show(); // here we no need to create instance of any class that needs to implement interface so we can 
		//directly access the static method of an interface
		
	}

}

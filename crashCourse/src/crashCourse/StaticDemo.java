package crashCourse;


class Emp {
	int eid;
	int salary;
	static String ceo; 
	
	static {
		ceo="David";
	}
	
	Emp(){
		eid=0;
		salary =10;
		
	}
	
	public void show() {
		System.out.println(eid + " : " +salary + " : " +ceo);
	}
}

public class StaticDemo {
	static int i=4;
	public static void main(String[] args) {
		System.out.println("i is non static method and want to access inside static main then it will show error " + i);
		// TODO Auto-generated method stub
			Emp mike = new Emp();
			mike.eid=1;
			mike.salary=100;
			
			Emp smith = new Emp();
			smith.eid=2;
			smith.salary=200;
			
			mike.show();
			smith.show();
			
			
	}

}
// if you don't want a variable to not be object specific then make a static variable
//static things load inside class loader memory not inside heap memory
// static block executes before constructor;
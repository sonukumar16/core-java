package crashCourse;

interface Writer {
	void write(); // this is by default public abstract method
}

class Pen implements Writer {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Pen");
	}
	
}

class Pencil implements Writer {

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("I'm a Pencil");
	}
	
}
class Kit {
	public void doSomethig (Writer w) {
		w.write();
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		k.doSomethig(pc);
	}
}
/*
 can't instantiate the instance of interface.
 try to choose interface over abstract 
 can achieve multiple inheritance with the help of interface 
 can't create instance of an interface but can Create reference.
*/

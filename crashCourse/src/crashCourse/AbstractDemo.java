package crashCourse;

abstract class Human {
	public abstract void walk();
	
	public void eat() {
		
	}
}

class Man extends Human {
	public void walk () {
		System.out.println("walk method of Man class");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Human human = new Human();// can't instantiate the Human abstract class
		
		
		Human human = new Man();
			human.walk();
	}

}

/* If you don't want to create an instance of a class then create an abstract class.
 * in case when don't want to define a method then make that method as an abstract method.
 * without abstract method a class can be abstract class but vice-versa is not true.
 * if you extend a abstract class and that abstract class has abstract methods then you have to override them.  
 */

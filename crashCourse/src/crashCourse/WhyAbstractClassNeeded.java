package crashCourse;

class Printer {
		public void show(Number i) {
			System.out.println("Number is " +i);
		}	
	}

public class WhyAbstractClassNeeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		printer.show(5.5f);
	}

}

/* In this example we are passing Number as a param to show method that will accept any number like integer, float, double.
 * but some time we just want a specific type of data like Integer or number etc.
 * to do that we have to make different different class and methods. any will create instance of child class not the parent class
 *
 */

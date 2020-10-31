package crashCourse;

/* Types of interface
1. Normal
2. Single abstract method - functional interface (an interface has only one method) - lambda expression -- scala 
3. Marker interface
*/

@FunctionalInterface
interface Abcd{
	void show();
}
public class AnonymousClassWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abcd abcd = new Abcd() {

				@Override
				public void show() {
					// TODO Auto-generated method stub
					System.out.println("Interace Anonynous");
				}
				
			};
			abcd.show();
	}

}

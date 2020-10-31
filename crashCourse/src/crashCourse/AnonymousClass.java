package crashCourse;

class AA {
	public void show () {
		System.out.println("In A class show");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA() {
			public void show () {
				System.out.println("Anonymous class:: show method");

			}
		};
		aa.show();
	}

}

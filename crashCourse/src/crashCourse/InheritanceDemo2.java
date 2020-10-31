package crashCourse;

class First {
	public void show () {
		System.out.println("Classs First show method");
	}
}

class Second {
	public void show () {
		System.out.println("Classs Second show method");
	}
}


public class InheritanceDemo2 extends Second, First { // can't extends 2 or more than 2 classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDemo2 b = new  InheritanceDemo2();
		b.show(); /* here show() is not decidable from which class it will be called
				so we say this problem as ambiguity problem. that' why java doesn't support multiple inheritance.
		 */		
	}

}

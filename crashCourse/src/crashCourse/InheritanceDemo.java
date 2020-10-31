package crashCourse;

class Calculator {
	public int add (int i, int j) {
		return i+j;
	}
}

class CalAdv  extends Calculator {
	public int sub(int i , int j) {
		return i-j;
	}
}

class CalVeryAdvance extends CalAdv {
	public int mul (int i, int j) {
		return i*j;
	}
}

// Multi label inheritance supported not multiple inheritance because of diamond problem

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalVeryAdvance obj = new CalVeryAdvance();
		int addResult = obj.add(5, 10);
		int multiplicationResult  = obj.mul(5, 10);
		System.out.println("Sum result is " + addResult);
		System.out.println("Multiplication result is " + multiplicationResult);
	}

}

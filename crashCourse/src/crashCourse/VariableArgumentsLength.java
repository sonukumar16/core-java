package crashCourse;

class Calc {
	public int add(int ...n) {
		int sum=0;
		for (int i :n) {
			sum = sum+i;
		}
		return sum;
	}
}
public class VariableArgumentsLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		System.out.println(calc.add(4,5,3,2,3,9,01));
	}

}

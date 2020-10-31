package crashCourse;

@FunctionalInterface
interface LambdaInterface {
	void print();
}
public class LmbdaFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface lambdaInterface = () -> System.out.println("Lambda function with marked interface");
		lambdaInterface.print();
	}

}

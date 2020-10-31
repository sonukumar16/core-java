package crashCourse;

class Student {
	private int roleNumber;
	private String name;
	
	public int getRoleNumber() {
		return roleNumber;
	}
	public void setRoleNumber(int roleNumber) {
		this.roleNumber = roleNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Mike");
		String name = s.getName();
		System.out.println("name is : " +name);
	}

}
/* Class' members should be always access through the methods 
 * Binding the data with method is called Encapsulation so use getter and setter 
 * only by using getter setter can access class data or members
 */
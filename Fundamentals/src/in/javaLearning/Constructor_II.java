package in.javaLearning;

class Employee{
//	int empId = 101;
//	String empName = "Arjun";
	int empId;
	String empName;
	
//	public Employee(){
//		System.out.println("Employee object created");
//	}
	public Employee(int id, String name){
		empId = id;
		empName = name;
	}
	public void showData() {
		System.out.println("id :"+empId+" name :"+empName);
	}
}
public class Constructor_II {

	public static void main(String[] args) {
//			Employee e1 = new Employee();
//			e1.showData();
//			Employee e2 = new Employee();
//			e2.showData();
		Employee e1 = new Employee(101, "harsh");
		e1.showData();
		Employee e2 = new Employee(102, "naveen");
		e2.showData();
	}

}

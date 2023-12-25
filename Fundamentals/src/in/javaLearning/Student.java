package in.javaLearning;

public class Student {
	int id =101; 
	String name= "Prashu";
	static String college = "AIT";
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.college);

		Student obj2 = new Student();
		obj2.id = 201;
		System.out.println(obj2.id);
	}

}

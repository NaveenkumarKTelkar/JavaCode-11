package in.javaLearning;

public class Method_I {
	
		//non-static fun
		public void great() {
			System.out.println("Hello");
		}
		
		public static void great2() {
			System.out.println("Static fn called");
		}
		
		public int addNumber() {
			return(10+12);
		}
		
		public void show (String name) {
			System.out.println("Hello " + name);
		}
	public static void main(String[] args) {
		Method_I obj = new Method_I();
		obj.great();
		//System.out.println("Hello");
		
		Method_I.great2();
		//System.out.println("Static fn called");
		int result = obj.addNumber();
		System.out.println(result);
		
		System.out.println(obj.addNumber());
		
//		obj.show(10);
		obj.show("Aryan");
	}

}

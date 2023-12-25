package in.javaLearning;

public class Variable {
	int a = 100;// instance variable

	public static void main(String[] args) {
		// classname objName = new classname();
		Variable obj = new Variable();
        //System.out.println(obj instanceof Variable);
        //System.out.println(a);

		// accessing instanc varibale: objName.varName
		System.out.println(obj.a);

		System.out.println("---------------");
		Variable obj2 = new Variable();
		System.out.println(obj2.a);
		obj.a = 500;
		System.out.println(obj.a);
		System.out.println(obj2.a);
	}

}

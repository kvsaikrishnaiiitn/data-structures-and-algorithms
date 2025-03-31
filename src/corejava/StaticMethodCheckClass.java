package corejava;

public class StaticMethodCheckClass {

	public static void main(String arg) {
		System.out.println("String args");
	}

	public static void main(String[] args) {
		StaticMethodCheckClass staticMethodCheckClass = new StaticMethodCheckClass();
		//staticMethodCheckClass.main(null);
		System.out.println("StaticMethodCheckClass.main()...");
	}
}

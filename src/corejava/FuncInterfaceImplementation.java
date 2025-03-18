package corejava;

public class FuncInterfaceImplementation implements FuncInterface {

	@Override
	public void accept(String s) {
		System.out.println("s:" + s);
	}

	public static void main(String[] args) {
		FuncInterfaceImplementation funcInterfaceImplementation = new FuncInterfaceImplementation();
		funcInterfaceImplementation.accept("Sample");

		FuncInterface funcInterface = s -> {
			System.out.println(s);
		};
		
		funcInterface.accept("Lambda");
		
		FuncInterface mR = System.out::println;
		mR.accept("MR");
	}
}

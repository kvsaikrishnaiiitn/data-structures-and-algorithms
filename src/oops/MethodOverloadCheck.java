package oops;
public class MethodOverloadCheck {

	void check(Object o) {
		// ………..
		System.out.println("MethodOverloadCheck.check()...Object!");
	}

	void check(String o) {
		// ………….
		System.out.println("MethodOverloadCheck.check()...String!");
	}
	
	public static void main(String[] args) {
		MethodOverloadCheck methodOverloadCheck = new MethodOverloadCheck();
		methodOverloadCheck.check(null);
		System.out.println("MethodOverloadCheck.main()...done!");
	}

}

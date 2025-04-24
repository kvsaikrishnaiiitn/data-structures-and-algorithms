package oops;

public class DaimondProblem {

	interface A {
		default void commonMethod() {
			System.out.println("DaimondProblem.A.commonMethod()");
		}
	}

	interface B {
		default void commonMethod() {
			System.out.println("DaimondProblem.B.commonMethod()");
		}
	}

	class C implements A, B {

		public void commonMethod() {
			System.out.println("DaimondProblem.C.commonMethod()");
		}

	}
}

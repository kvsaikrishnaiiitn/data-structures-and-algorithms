package corejava;

public class SingleTonDPExample {

	private SingleTonDPExample() {
	}

	static class SingleTonDPExampleHolder {
		private final static SingleTonDPExample INSTANCE = new SingleTonDPExample();
	}

	public static SingleTonDPExample getInstance() {
		return SingleTonDPExampleHolder.INSTANCE;
	}

}

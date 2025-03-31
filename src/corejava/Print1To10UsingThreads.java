package corejava;

public class Print1To10UsingThreads {
	public static void main(String[] args) {
		Object object = new Object();
		int totalNumberOfThreads = 3;

		Thread[] threads = new Thread[totalNumberOfThreads];
		for (int index = 0; index < totalNumberOfThreads; index++) {
			threads[index] = new Thread(new NumberPrintThread(object, index, totalNumberOfThreads), "Thread" + index);
			threads[index].start();
		}
		System.out.println("All threads are started...");
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main completed.");
	}
}

class NumberPrintThread implements Runnable {

	private Object object;
	private int threadId;
	private int totalNumberOfThreads;

	public NumberPrintThread(Object object, int threadId, int totalNumberOfThreads) {
		this.object = object;
		this.threadId = threadId;
		this.totalNumberOfThreads = totalNumberOfThreads;
	}

	private static int number = 1;

	@Override
	public void run() {
		while (number <= 10) {
			synchronized (object) {
				if (number % totalNumberOfThreads == threadId) {
					System.out.println(Thread.currentThread().getName() + " is printing number:" + number);
					number++;
					object.notifyAll();
				} else {
					//System.out.println(Thread.currentThread().getName() + " is waiting for lock...");
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		}

	}

}
package com.cms.threads;
import java.util.concurrent.Semaphore;

public class SempahoreExample {
	private static final int MAX_CONNECTIONS = 10;
	private static Semaphore semaphore = new Semaphore(MAX_CONNECTIONS);

	public static void getConnection() throws InterruptedException {
		semaphore.acquire(); // Acquiring lock
		// Use connection
		Thread.sleep(5 * 1000);
		semaphore.release(); // Release lock
	}

	public static void main(String[] args) {

	}

}

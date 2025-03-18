package com.cms.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("RunnableExample.main()...is running...");
		try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
			for (int i = 0; i < 10; i++) {
				executorService.execute(() -> {
					System.out.println(Thread.currentThread().getName() + " is running...");
					try {
						Thread.sleep(5 * 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " is completed.");
				});
			}
		}
		System.out.println("RunnableExample.main()...is completed.");
	}

}

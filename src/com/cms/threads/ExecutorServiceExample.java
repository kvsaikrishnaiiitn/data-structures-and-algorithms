package com.cms.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for (int index = 0; index < 10; index++) {
			int taskNumber = index;
			executorService.execute(() -> {
				System.out.println("Task" + taskNumber + " is running....");
				try {
					Thread.sleep(1 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Task" + taskNumber + " execution completed!");
			});
		}

		executorService.shutdown();
		try {
			executorService.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main is completed!");
	}

}

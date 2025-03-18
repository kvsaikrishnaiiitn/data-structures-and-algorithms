package corejava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable1 = () -> {
			System.out.println("CallableExample.main()...runnable1...");
			try {
				Thread.sleep(2 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " runnable1 is completed.");
		};

		Callable<Integer> callable1 = () -> {
			System.out.println("CallableExample.main()...callable1...");
			Thread.sleep(5 * 1000);
			System.out.println(Thread.currentThread().getName() + " callable1 is completed.");
			return 10;
		};

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(runnable1);

		Future<Integer> futureResult = executorService.submit(callable1);
		/*
		 * while (!futureResult.isDone()) { Thread.sleep(1 * 1000);
		 * System.out.println("Waiting in the while loop..."); }
		 * System.out.println("While loop is completed.");
		 */

		try {
			System.out.println(futureResult.get(3, TimeUnit.SECONDS));
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}

		executorService.shutdownNow();
		System.out.println("Main is completed.");

	}

}

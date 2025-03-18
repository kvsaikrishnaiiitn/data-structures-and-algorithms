package com.cms.threads;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> sumInteger = new SumInteger(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });

		try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
			Future<Integer> sum = executorService.submit(sumInteger);
			/*
			 * while (!sum.isDone()) {
			 * System.out.println("CallableUsage.main()...still waiting..."); Thread.sleep(1
			 * * 10); }
			 */
			System.out.println("sum:" + sum.get());
		}
		System.out.println("CallableUsage.main()...completed!");
	}
}

class SumInteger implements Callable<Integer> {
	int[] numbers;

	public SumInteger(int[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}

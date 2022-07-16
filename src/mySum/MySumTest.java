package mySum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MySumTest {
	 public static void main(String[] args) throws InterruptedException {
		 ExecutorService executorService = Executors.newFixedThreadPool(100);
		 MySum mySum = new MySum();
		 for (int i = 0; i < 100; i++) {
			 executorService.submit(() -> mySum.increaseSum());
		 }
		 executorService.shutdown();
		 executorService.awaitTermination(60, TimeUnit.SECONDS);
	 }
}

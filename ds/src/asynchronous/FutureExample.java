package asynchronous;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> futureResult = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Future Result";
        });

        while (!futureResult.isDone()) {
            System.out.println("Future task is still in progress...");
            Thread.sleep(500);
        }

        String resultFromFuture = futureResult.get();
        System.out.println("Future Result: " + resultFromFuture);

        executorService.shutdown();
    }
}

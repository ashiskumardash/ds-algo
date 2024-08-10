package asynchronous;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CompletableFuture<String> completableFutureResult = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "CompletableFuture Result";
        }, executorService);

        completableFutureResult.thenAccept(result -> {
                    System.out.println("Promise Result: " + result);
                })
                .exceptionally(throwable -> {
                    System.err.println("Error occurred: " + throwable.getMessage());
                    return null;
                });

        System.out.println("Doing other tasks...");

        executorService.shutdown();
    }
}

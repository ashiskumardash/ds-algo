package asynchronous;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        Runnable runnableTask = () -> {
            System.out.println("Hello from runnable");
        };
        Runnable longRunningTask = () -> {
            try {
                System.out.println("Long running Task Started");
                Thread.sleep(2000);
                System.out.println("Long running Task Ended");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor.execute(longRunningTask);
        executor.execute(runnableTask);
        System.out.println("Method completed");
        executor.shutdown();
    }
}

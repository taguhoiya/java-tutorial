import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Future<String> completableFuture =
                CompletableFuture.completedFuture("Hello");

        String result = completableFuture.get();
        System.out.println("Hello " + result); // Print the result
    }

    public static Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(5000);
                completableFuture.complete("World");
            } catch (InterruptedException e) {
                completableFuture.completeExceptionally(e);
            }
            return null;
        });

        return completableFuture;
    }
}

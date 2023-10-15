import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class SupplyAsync {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Hello");

        // return value for thenAccept()
        CompletableFuture<String> future = completableFuture
                .thenApply(s -> s + " World");

        System.out.println(future.get());

        // no return value for thenAccept()
        CompletableFuture<String> completableFuture2
                = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<Void> future2 = completableFuture2
                .thenAccept(s -> System.out.println("Computation returned: " + s));

        future2.get();

        // thenCompose example
        CompletableFuture<String> completableFuture3
                = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"))
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " !!!!!!"));

        System.out.println(completableFuture3.get());
    }


    public static Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(50000);
                completableFuture.complete("World");
            } catch (InterruptedException e) {
                completableFuture.completeExceptionally(e);
            }
            return null;
        });

        return completableFuture;
    }
}

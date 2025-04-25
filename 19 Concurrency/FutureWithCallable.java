
import java.util.concurrent.*;

public class FutureWithRunnable{

	public static int add(int a, int b){
		System.out.println("executing");
		return a + b;
	}

	public static void main(String...args) throws InterruptedException, ExecutionException{
	
		try(var service = Executors.newSingleThreadExecutor()){
			
			System.out.println("Main Thread - Init");
			
			Future<Integer> result = service.submit( () -> add(5,4) );
			System.out.println("result: " + result.get());


			System.out.println("Main thread - End");
		}

	}

}

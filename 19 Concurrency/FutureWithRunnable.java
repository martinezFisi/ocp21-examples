
import java.util.concurrent.*;

public class FutureWithRunnable{

	public static void print(){
		System.out.println("Executing thread");
	}

	public static void main(String...args) throws InterruptedException, ExecutionException{
	
		try(var service = Executors.newSingleThreadExecutor()){
			
			System.out.println("Main Thread - Init");
			
			Future<?> result = service.submit( () -> print() );
			System.out.println("result: " + result.get());//call submit over runnable always return null


			System.out.println("Main thread - End");
		}

	}

}

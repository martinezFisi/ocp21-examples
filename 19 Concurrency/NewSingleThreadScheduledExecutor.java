
import java.util.concurrent.*;

public class NewSingleThreadScheduledExecutor{

	public static void main(String...args) throws Exception {
		
		try(var service = Executors.newScheduledThreadPool(10)) {
			
			service.scheduleAtFixedRate( () -> System.out.println("fixed rate finished"), 3/*init delay*/, 2/*period*/, TimeUnit.SECONDS);//always execute every 2 seconds without wait for the previous task
			
			service.scheduleWithFixedDelay( ()-> {for(long i=0; i<10000000000L; i++); System.out.println("fixed delay finished");}, 3/*init delay*/, 2/*delay*/, TimeUnit.SECONDS );//wait for the previous task to finish
			
			Thread.sleep(20_000);//sleep the main thread for service.close() no execute inmediatly by try with resource
		}
		
	}

}

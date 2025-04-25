
import java.util.concurrent.*;

public class NewSingleThreadExecutor{

	public static void main(String...args){

		try( var service = Executors.newSingleThreadExecutor() ){
			
			System.out.println("Main Thread init");

			service.execute( () -> System.out.println("first execution") );
			service.execute( () -> System.out.println("second execution") );
			service.execute( () -> System.out.println("third execution") );
			
			System.out.println("Main Thread end");
		}

	}

}

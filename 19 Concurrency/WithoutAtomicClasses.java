
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class WithoutAtomicClasses{


	//Para obtener el caso de numeros repetidos ejecutar la clase con el siguiente comando en la terminal
	//for i in {1..10}; do java WithoutAtomicClasses.java; done
	public static void main(String...args) throws Exception{
		
		try( var service = Executors.newFixedThreadPool(20) ) {
			
			var manager = new SheepManager();

			for(int i = 0; i < 10; i++) 
				service.submit( () -> manager.incrementAndReport() );

		}

		
		System.out.println();
	}


}

class SheepManager{

	private int sheepCount = 0;

	public void incrementAndReport(){
		try { Thread.sleep(50); } catch(InterruptedException e) {};//para aumentar probabilidad de colision
		System.out.print( ++sheepCount + " " );
	}

}


import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class SynchronizedBlock{


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
		
		synchronized(this){//obliga a que este bloque de codigo se ejecute por solo un hilo a la vez, esto permitira que los numeros se impriman en orden
			System.out.print( ++sheepCount + " " );
		}

	}

}

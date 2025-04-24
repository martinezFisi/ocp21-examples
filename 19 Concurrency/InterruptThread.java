
public class InterruptThread{

	public static void main(String...args){

		
		var thread = Thread.ofPlatform().start( () -> { 
			try {
				System.out.println("Running thread");
				Thread.sleep(10_000);
				System.out.println("Thread finished");
	
			} catch(InterruptedException e) {
				System.out.println("Thread Interrupted");
			} 
		} );

		thread.interrupt();
	}

}

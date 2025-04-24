
//If only left daemon threads, the program will finished without wait them
public class DemonThread{

	public static void pause(){
		
		try { 
			Thread.sleep(5_000); //wait for 5 seconds
			System.out.println("Virtual Thread finished");
		} catch(InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String...args){
		
		Thread.ofVirtual().start( () -> pause() );//Virtual Threads are by default daemons
		System.out.println("Main method finished");

	}

}

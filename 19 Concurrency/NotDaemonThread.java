
//The program will wait for all not daemon threads to finish
public class NotDaemonThread{

	public static void pause(){
		
		try { 
			Thread.sleep(5_000); //wait for 5 seconds
			System.out.println("Thread finished");
		} catch(InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void main(String...args){
		
		Thread.ofPlatform().start( () -> pause() );//Thread platform by default arent Daemon Threads
		System.out.println("Main method finished");

	}

}

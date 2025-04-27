
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.stream.*;

public class Locks{


	public static void print(Lock lock, int i) {
		var waitTime = (int)(Math.random()*1000);//0 - 1000

		try {
			if (lock.tryLock( waitTime, TimeUnit.MILLISECONDS)) {
				try {
					System.out.println("thread %d - executing".formatted(i));
					try{ Thread.sleep(50); } catch(InterruptedException e){}

				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("thread %d - code block locked".formatted(i));
			}
		} catch (InterruptedException e) {}
	}
	
	public static void main(String...args) {

		var pool = Integer.valueOf(args[0]);
		var myLock = new ReentrantLock();

		 try (var service = Executors.newFixedThreadPool(pool);) {
			
			Stream.iterate(1, i -> ++i)
			      .limit(pool)
			      .forEach(i -> service.execute( () -> print(myLock, i)) );

		 }

	}

}

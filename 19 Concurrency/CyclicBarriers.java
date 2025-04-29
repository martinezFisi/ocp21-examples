
import java.util.concurrent.*;
import java.util.stream.*;

public class CyclicBarriers{

	public static class LionPenManager{

		private void removeLions(int i){ System.out.println("Thread %d - Removing lions".formatted(i)); }
		private void cleanPen(int i){ System.out.println("Thread %d - Cleaning the pen".formatted(i)); }
		private void addLions(int i){ System.out.println("Thread %d - Adding lions".formatted(i)); }

		public void performTask(CyclicBarrier c1, CyclicBarrier c2, int i){
			try {
				removeLions(i);
					c1.await();//obliga a los 4 hilos a esperar aqui hasta que todos lleguen a este punto
				cleanPen(i);
					c2.await();//
				addLions(i);
			} catch (InterruptedException | BrokenBarrierException e) {
				//handle error
			}
		}

	}

	public static void main(String...args){

		var POOL = 4;

		try(var service = Executors.newFixedThreadPool(POOL)){
			
			var manager = new LionPenManager();
			var c1 = new CyclicBarrier(POOL);
			var c2 = new CyclicBarrier(POOL, () -> System.out.println("**Pen cleaned!"));

			Stream.iterate(1, i -> ++i)
			      .limit(POOL)
			      .forEach( i -> service.execute( () -> manager.performTask(c1, c2, i) ));

		}

	}

}

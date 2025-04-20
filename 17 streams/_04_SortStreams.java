import java.util.stream.*;

public class _04_SortStreams{

	public static void main(String...args){

		Stream.of(5,2,3,9,1)
		      //.sorted()
		      .sorted( (x,y) -> y.compareTo(x) )
		      .forEach(System.out::println);

	}

}


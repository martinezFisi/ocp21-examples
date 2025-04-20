import java.util.stream.*;
import java.util.*;

public class _03_PrimitiveStreams{

	public static void main(String...args){
		
	var res = LongStream.of(1L,2L,3L)
			  .mapToInt(x -> (int)x)
			  .boxed()	
			  //.forEach(System.out::println);
			  //.collect(Collectors.groupingBy(x -> x));
			  .collect(Collectors.averagingInt(x -> x));	

	System.out.println(res);
	
	var res2 = IntStream.empty().sum();
	var res3 = IntStream.of(1,2,3).average();

	System.out.println(res2);
	System.out.println(res3.getAsDouble());

	var res4 = IntStream.of(1,2,3)
		            .map( x -> x * 10)
			    .filter( x -> x < 15)
			    .findFirst();

	System.out.println(res4.getAsInt());

	Stream<Integer> res5 = IntStream.of(1,2,3).mapToObj(x -> x);


	}

}


import java.util.stream.*;

public class _01_InfinitStreams{

	public static void main(String...args){
		
		Stream.iterate(0, i -> i < 5,i -> i + 1).limit(10).forEach(System.out::println);

		Stream.generate( Math::random ).limit(5).forEach(System.out::println);

		System.out.println(Stream.generate( () -> "" )
				         .anyMatch(String::isEmpty)
			          );

		System.out.println(
					Stream.iterate(1, x -> ++x)
					      .limit(5)
					      .map(x -> ""+x)
					      .collect(Collectors.joining())
				  );
	}


}


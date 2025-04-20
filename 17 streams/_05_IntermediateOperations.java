import java.util.stream.*;
import java.util.*;

public class IntermediateOperations{

	public static void main(String...args){

		List<Integer> list = List.of(1,2,3);

		Stream.concat(list.stream(), list.stream())
		      .distinct()
		      .forEach(System.out::println);

	}

}

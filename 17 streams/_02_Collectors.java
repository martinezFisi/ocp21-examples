import java.util.stream.*;
import java.util.*;

public class _02_Collectors{

	public static void main(String...args){
		
		Map<Integer, List<String>> res = Stream.of("hola", "mundo", "java")
			                               .collect( Collectors.groupingBy( v -> v.length()) );
		System.out.println(res);

		var res2 = Stream.empty().collect(Collectors.partitioningBy( x -> x == null));
		System.out.println(res2);

		var res3 = Stream.empty().collect(Collectors.groupingBy(x -> x == null));
		System.out.println(res3);
	}

}



import java.util.List;

public class Records{
	
	public static void main(String...args){

		record Person(String name, int age) implements nadar{
		
			Person{
				name = name.toUpperCase();
				age = age - 2;
			}

			public String respirar(){
				return "respirar";
			}

		}

		var persons = List.of( new Person("Antony", 30), new Person("Juan", 20) );

		persons.stream().forEach(System.out::println);

		System.out.println(persons.get(0).respirar());
	}

	
	
}

interface nadar{
	String respirar();
}

import java.time.*;
import java.time.format.*;

public class Formatting{

	public static void main(String...args){
		
		var dateTime = LocalDateTime.now();
		
		var f1 = DateTimeFormatter.ofPattern("d/M/yy HH:mm:ss");
		var f2 = DateTimeFormatter.ofPattern("d/MMMM/yyyy hh:mm:ss a");
		var f3 = DateTimeFormatter.ofPattern("d/MMM/yyyy 'a las' hh:mm:ss a");

		System.out.println(dateTime.format(f1));
		System.out.println(dateTime.format(f2));
		System.out.println(dateTime.format(f3));

		//Timezone
		var zonedDateTime = ZonedDateTime.now();

		var f4 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' hh:mm:ss a 'con zona horaria' z");
		var f5 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' hh:mm:ss a 'con diferencia de ' Z");

		System.out.println(zonedDateTime.format(f4));
		System.out.println(zonedDateTime.format(f5));
	}

}

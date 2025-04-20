public class Textblocks{

	public static void main(String...args) {

		String sql = """
		  SELECT id, name, age
		  FROM Employee
		 WHERE name like '%Luis%'""";

		System.out.println("""
					sql: 
					""" + sql);
	}

}


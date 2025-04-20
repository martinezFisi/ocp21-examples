import java.util.Date;
import java.sql.*;

class Animal{
	
	public static void main(String...args){
		Date date = new Date();
		System.out.println("Date: " + date);
		
		java.sql.Date sqlDate = new java.sql.Date(2,2,2);
		System.out.println("Sql Date: " + sqlDate);
	}
	
}
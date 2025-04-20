class Switch{

	public static void main(String...x){
	
		var param = x[0];

		switch(param){
			case "1":
				System.out.println("Fue 1");
				break;
			case "2":
				System.out.println("Fue 2");
				{
					System.out.println("Nueva linea");
				}
				break;
			case "3":
				{

				}

		}

	}

}

class Switch2{

	public static void main(String[]args){

		var param = args[0];

		switch(param){
			default:
				System.out.println("default"); break;
			case "1", "2":
				System.out.println("1, 2"); break;
			case "3":
				System.out.println("3");
		}


	}

}

class Switch3{

	public static void main(String...params){

		String param = params[0];
		Number n;

		try{ n = Integer.valueOf(param); } catch(NumberFormatException e){ System.out.println("Ex: " + e.getMessage()); n = null; }


		switch(n){
			case null : 
				System.out.println("Valor null");
				break;
			case Integer i when i >= 10 && i <= 20 : 
				System.out.println("Valor Integer entre 10 y 20: " + i);
				break;
			case Integer i :
				System.out.println("Valor Integer: " + i);
			default :
				System.out.println("default");
		}

	}

}

class Switch4{

	public static void main(String...args){

		var param = args[0];

		System.out.println(
					switch(param){
						default -> "otro valor";
						case "1" -> "Valor 1";
						case "2" -> "Valor 2";
					}
				);

	}

}


class Switch5{

	public static void main(String args[]){

		var param = (Number)Integer.valueOf(args[0]);
		
		var result = switch(param){
			
			case Integer i when i >= 20 -> {yield i*2;}
			case Integer i when i <= 10 -> i;
			case Double d -> 0;
			case Number n -> 99;

		};

		System.out.println("result: " + result);

	}

}


class Switch6{

	public static void main(String[]args){
	
		String zooStatus = "Closed";
		int visitors = switch(zooStatus){
			case String s /*when s.equals("Open")*/ -> 10;
			case Object s /*when s!=null && !s.equals("")*/ -> 20;
			case null -> {yield 30;}
			//default -> 40;
		};

		System.out.println(visitors);

	}

}


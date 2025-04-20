public class SwitchWithEnum{

	static enum Estacion{
		VERANO, OTONIO, INVIERNO, PRIMAVERA
	}

	public static void main(String...args){
		Estacion e = null;

		int x = switch(e){
			case VERANO -> 1;
			case Estacion.OTONIO -> 2;
			case INVIERNO -> 3;
			case PRIMAVERA -> 4;
		};
		;
		;
		;;;;;;

		System.out.println("x = " + x);
	};


}

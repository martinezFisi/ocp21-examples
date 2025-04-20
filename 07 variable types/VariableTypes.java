class VariableTypes{

	public static void main(final String[]args){

		short s = (short)5L;//al tener el L, java se condiciona pensando que puede ser un valor fuera del rango del short, x eso necesita una conversion explicita
		System.out.println("s = " + s);

		short s2 = 5;//5 esta dentro del rango del short, x lo cual java realiza una conversion implicita
		
	}

}


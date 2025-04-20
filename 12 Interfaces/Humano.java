
	public class Humano implements Correr, Nadar{

		public Integer respirar(int tiempo3){
			System.out.println("Respirar: " + tiempo3);

			return 1;
		}
		

		public static void main(String...args){
			new Humano().respirar(5);
		}
	}


	abstract interface Correr{
		
		public abstract Number respirar(int tiempo);

	}

	abstract interface Nadar{

		public abstract Object respirar(int tiempo2);

	}
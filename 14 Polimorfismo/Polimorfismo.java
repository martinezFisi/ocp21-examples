
public class Polimorfismo{

	public static void main(String...args){
		
		Hombre hombre = new Bombero();
		Nadar nadar = (Nadar) hombre;
		nadar.respirar();

	}

}

interface Nadar{
	void respirar();
}

class Humano{}

class Hombre extends Humano{}

class Bombero extends Hombre implements Nadar{
	
	public void respirar(){
		System.out.println("Respirar");
	}

}

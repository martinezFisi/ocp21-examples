public class InstanceMethodOnParameter {

	public static void main(String...args) {
		String frase = "En duro";
		
		Emptyable e = s -> s.isEmpty();
		Emptyable e2 = String::isEmpty;

		System.out.println("Is empty: " + e.empty(frase));
		System.out.println("Is empty 2: " + e2.empty(frase));

	}

}

interface Emptyable {
	boolean empty(String s);
} 

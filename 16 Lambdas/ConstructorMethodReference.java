public class ConstructorMethodReference {

	public static void main(String...args) {
		Stringable s = () -> new String();
		Stringable s2 = String::new;

		System.out.println("Stringable: " + s2.create());

		StringableWithParameter s3 = text -> new String(text);
		StringableWithParameter s4 = String::new;

		System.out.println("Stringable with parameter: " + s4.create("En duro"));
	}

}

interface Stringable{
	String create();
}

interface StringableWithParameter {
	String create(String s);
}

public class InstanceMethodOnObject{

	public static void main(String...args){
		String s = "En duro";
		StringStartsWith sw = (String value) -> s.startsWith(value);
		StringStartsWith sw2 = s::startsWith;

		var v1 = "En "; var v2 = "Enn";
		System.out.println(s + " comienza con " + v1 + " : " + sw.test(v1));
		System.out.println(s + " comienza con " + v2 + " : " + sw2.test(v2));

		Printable p = v1::toString;
		System.out.println("Printable: " + p.print());
	}

}

interface StringStartsWith{
	boolean test(String value);
}

interface Printable {
	String print();
}

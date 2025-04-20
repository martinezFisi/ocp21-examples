 public class StaticMethodReference{

	 public static void main(String...args){
		
		Randomness r = () -> Math.random();
		Randomness r2 = Math::random;
		System.out.println("random = " + r.getRandom());
		System.out.println("random 2 = " + r2.getRandom());

		Absoluteness abs = value -> Math.abs(value);
		Absoluteness abs2 = Math::abs;
		System.out.println("absolute = " + abs.getAbs(-2.0D));
		System.out.println("absolute 2 = " + abs2.getAbs(-3D));
	 }

 }

interface Randomness{
	double getRandom();
}

interface Absoluteness{
	double getAbs(double value);
}

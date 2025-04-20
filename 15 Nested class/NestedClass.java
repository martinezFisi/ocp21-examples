
public class NestedClass{

	class InnerClass{
		private int a;
		private int b;

		public boolean equals(Object o){
			if(this == o){
				return true;
			}

			if(o instanceof InnerClass i){
				return this.a == i.a && this.b == i.b;
			}

			return false;
		}
	}

	public static void main(String...args){
		NestedClass n = new NestedClass();
		NestedClass.InnerClass x = n.new InnerClass();
		NestedClass.InnerClass y = n.new InnerClass();

		System.out.println("x == y: " + x.equals(y));
	}

}

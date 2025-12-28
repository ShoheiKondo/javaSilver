package javaSilver;

public class TestUsing6_23 {

	public static void main(String[] args) throws Exception{
		A a = new A();
		try (a;
		B b = new B();
		C c = new C()){
			//do something
		}
		

	}

}

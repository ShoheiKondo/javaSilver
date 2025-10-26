package javaSilver;

public class Sample4_30 {

	public static void main(String[] args) {
		A[] array = {new A(), new B(),new A(),new B()};
		for(A a:array) {
			if(a instanceof B b) {
				a.test();
			}else {
				b.test();
			}
		}

	}

}











































package javaSilver;

public class Mondai3_10 {

	public static void main(String[] args) {
		Object a = new Sample3_10(10);
		Object b = new Sample3_10(10);

		// num が同じなので true
		System.out.println(a.equals(b));
	}
}
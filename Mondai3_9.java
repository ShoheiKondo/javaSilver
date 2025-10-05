package javaSilver;

public class Mondai3_9 {
	public static void main(String[] args) {
		Sample3_9 a = new Sample3_9(10, "a");
		Sample3_9 b = new Sample3_9(10, "b");

		// num が同じなので true
		System.out.println(a.equals(b));
	}
}
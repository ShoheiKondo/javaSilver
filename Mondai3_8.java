package javaSilver;

public class Mondai3_8 {
	public static void main(String[] args) {
		Sample3_8 s1 = new Sample3_8(10);
		Sample3_8 s2 = s1;
		s1 = new Sample3_8(10);
		System.out.println(s1 == s2); // false が出力される
	}
}
package javaSilver;

public class Mondai4_5 {
	public static void main(String[] args) {
		Sample4_5.num = 10;
		Sample4_5 s = new Sample4_5();
		Sample4_5 s2 = new Sample4_5();
		s.num += 10;
		s2.num = 30;
		System.out.println(Sample4_5.num);

	}

}

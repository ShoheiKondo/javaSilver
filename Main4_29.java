package javaSilver;

public class Main4_29 {

	public static void main(String[] args) {
		Sample4_29 s = new Sample4_29(10);
		modify(s);
		System.out.println(s.num);
	}
	private static void modify (Sample4_29 s) {
		s.num*=2;
	}

}

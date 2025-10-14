package javaSilver;

public class Main4_28 {

	public static void main(String[] args) {
		Sample4_28 s = new Sample4_28(10);
		modify(s.num);
		System.out.println(s.num);
	}
	private static void modify(int num) {
		num*=2;
	}

}

package javaSilver;

public class Main6_12 {

	public static void main(String[] args) {
		try {
			sample();
		}catch(StackOverflowError e) {
			System.out.println("kondo");
		}
		System.out.println("finish");

	}
	private static void sample() {
		sample();
	}
		

}

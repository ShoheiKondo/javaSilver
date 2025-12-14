package javaSilver;
import javax.management.RuntimeErrorException;

public class Main6_6 {

	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}
	private static int sample() {
		try {
			throw new RuntimeException();
		}catch(RuntimeException e) {
			return 10;
		}finally {
			retuern 20;
		}
	}

}

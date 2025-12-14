package javaSilver;

public class Main6_4 {
	public static void main(String[]args) {
		try {
			Object obj = null;
			System.out.println(obj.toString());
			System.out.println("A");
		}finally {
			System.out.println("B");
		}catch(NullPointerException e) {
			System.out.println("C"); 
		}
	}

}

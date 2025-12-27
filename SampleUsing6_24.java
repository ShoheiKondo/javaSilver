package javaSilver;

public class SampleUsing6_24 {

	public static void main(String[] args) {
		try(SampleResource6_21 resource = new SampleResource6_21();){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

	}

}

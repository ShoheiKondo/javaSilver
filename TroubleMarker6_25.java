package javaSilver;

public class TroubleMarker6_25 {

	public static void main(String[] args) {
		try (TroubleResource6_25 a = new TroubleResource6_25()) {
		    throw new Exception();
		} catch (RuntimeException e) {
		    System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}


	}

}

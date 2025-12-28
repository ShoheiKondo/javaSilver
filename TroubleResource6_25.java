package javaSilver;

public class TroubleResource6_25 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		throw new RuntimeException("trouble");
	}

}

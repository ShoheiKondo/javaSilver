package javaSilver;
public class Sample3_9 {
	private int num;
	private String name;

	// コンストラクタ（クラス名と一致させる）
	public Sample3_9(int num, String name) {
		this.num = num;
		this.name = name;
	}

	// equals メソッドをオーバーライド
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Sample3_9) {
			Sample3_9 s = (Sample3_9) obj;
			// num が同じなら true
			return s.num == this.num;
		}
		return false;
	}
}
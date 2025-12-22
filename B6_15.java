package javaSilver;

public class B6_15 {
	private int num;
	public B(int num) {
		this.num = num;
	}
	
	public boolean equals(Object obj) {
	    B b = (B) obj;
	    return this.num == b.num;
	}


}

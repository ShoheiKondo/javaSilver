package javaSilver;

public class Sample{
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
	
	
	return this.num == obj.num;
	}
}










public class Mondai2_1 {
	public static void main(String[] args) {
		Object a = new Sample(10);
		Object b = new Sample(10);
		System.out.println(a.equals(b));
	}
	}


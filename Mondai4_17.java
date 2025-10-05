package javaSilver;

public class Mondai4_17 {
	public static void main(String[]args) {
		//インスタンス化　ｍというMondai4＿17のインスタンスを作っています
		Mondai4_17 m = new Mondai4_17();
		//(2,3)で2つの引数よりcalcを呼び出してその結果を出力
		System.out.println(m.calc(2,3.0));
	}
	private double calc(double a, int b) {
		return (a+b) / 2;
	}
	private double calc(int a, double b) {
		return (a+b) / 2;
	}
}

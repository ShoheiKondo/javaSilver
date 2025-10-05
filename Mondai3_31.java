package javaSilver;

public class Mondai3_31 {
	public static void main(String[] args) {
//		for(int i = 0, j = 0; i < 3, j < 5;	i++ ) {
		for(int i = 0, j = 0; i < 3 && j < 5;	i++ ) {
		// 条件式には&&のような論理演算子を使えばコンパイルエラーをなくすことができる
			System.out.println(++i);
			j += i;
		}
	}
}


package javaSilver;

public class Mondai3_19 {

	public static void main(String[] args) {
		int num = 1;
		switch (num) {
			case 1:		
			case 2 :
			case 3 :	System.out.println("A");
			// break;を使うことでそのあとの処理が実行されなくなる
			// つまりここで使うとAのみの表示となる
			// break;
			case 4 : 	System.out.println("B");
			default:
				System.out.println("C");
		
		}
	}

}

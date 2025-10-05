package javaSilver;

public class Mondai3_22 {
	public static void main(String[] args) {
		int score = 85;
		String grade = switch(score/10) {
		case 10,9	-> 	"A";
		case 8	->	"B";
		case 7	->	"C";
		case 6	-> "D";
		};
		System.out.println("Grade:"+grade);
	}
	

}





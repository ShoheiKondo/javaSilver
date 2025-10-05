package javaSilver;

public class Sample4_15 {
    public void method(int num) {
        if (num < 0) {
            return;
        } else {
            System.out.println("A");
        }
        System.out.println("B"); // return の外ならOK
    }
}

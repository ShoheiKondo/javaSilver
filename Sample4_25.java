package javaSilver;

public class Sample4_25 {
    public Sample4_25() {
        this("B"); // ← 最初に呼び出す
        System.out.println("A");
    }
    public Sample4_25(String str) {
        System.out.println(str);
    }
}

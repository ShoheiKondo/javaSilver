package javaSilver;

public class Main5_14 {
    public static void main(String[] args) {
        Worker5_14 a = new Engineer5_14();   // ❌ Worker は存在しない
        Employee5_14 b = new Engineer5_14();
        Engineer5_14 c = new Engineer5_14();

        a.create();
        b.work();
        c.report();
    }
}
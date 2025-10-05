package javaSilver;

public class Mondai4_2 {
    public static void main(String[] args) {
        Item4_2 a = new Item4_2();
        Item4_2 b = new Item4_2();

        a.name = "apple";
        a.price = 200;

        b.name = "banana";
        b.price = 100;

        // b に a の値をコピー
        b.name = a.name;
        b.price = a.price;

        a = b;   // a は b を参照する

        a.printInfo();
    }
}
package javaSilver;

class Child5_21 extends Parent5_21 {
    public Child5_21() {
        super();            // Parent()
        System.out.println("C");
    }

    public Child5_21(String val) {
        this();             // Child()
        System.out.println(val);
    }
}
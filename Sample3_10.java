package javaSilver;

public class Sample3_10 {
    private int num;

    public Sample3_10(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Sample obj) {
        if (obj == null) {
            return false;
        }
      
            return this.num == obj.num;
        
    }
}
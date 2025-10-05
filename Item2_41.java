package javaSilver;

public class Item2_41 {
	private String name;
	private int price;
	public Item2_41(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Item2_41) {
			Item2_41 tmp = (Item2_41) obj;
			if(tmp.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	public String getName() {
		return name;
    }
}

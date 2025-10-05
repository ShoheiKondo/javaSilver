package javaSilver;

import java.util.ArrayList;

public class Mondai2_41 {
	public static void main(String[]args) {
		ArrayList<Item2_41> list = new ArrayList<>();
		list.add(new Item2_41("A", 100));
		list.add(new Item2_41("B", 200));
		list.add(new Item2_41("C", 300));
		list.add(new Item2_41("A", 100));
//		list.remove(new Item2_41("A", 500));
		//リストに含まれる全てのA削除するときはremoveifをつかう
		list.removeIf(s -> s.equals(new Item2_41("A", 500)));
		for(Item2_41 item : list) {
			System.out.println(item.getName());
		}
	}

}

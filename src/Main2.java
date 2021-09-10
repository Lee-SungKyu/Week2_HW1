import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

	private static final boolean FruitApp_sort = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FruitApp_sort> list = new ArrayList<FruitApp_sort>();
		
		list.add(new FruitApp_sort("Apple"));
		list.add(new FruitApp_sort("Banana"));
		list.add(new FruitApp_sort("Mango"));
		list.add(new FruitApp_sort("Melon"));
		list.add(new FruitApp_sort("Pear"));
		list.add(new FruitApp_sort("Strawberry"));
		list.add(new FruitApp_sort("Kiwi"));
		list.add(new FruitApp_sort("Orange"));
		list.add(new FruitApp_sort("Pineapple"));
		list.add(new FruitApp_sort("Coconut"));
		
		System.out.println("Fruit List (ordered by name)");
		
		Collections.sort(list, new FruitComparator());
		
		for (FruitApp_sort s : list)
		{
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reversed ordered by name)");
		
		Collections.sort(list, new FruitComparatorDesc());
		
		for (FruitApp_sort s : list)
		{
			System.out.println(s.toString());
		}
	}

}

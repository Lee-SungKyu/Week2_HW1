import java.util.Comparator;

//Comparator <t>


public class FruitApp_sort {
	String name;

	public FruitApp_sort () {}
	public FruitApp_sort(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FruitApp_sort [name=" + name + "]";
	}
	
}

class FruitComparator implements Comparator<FruitApp_sort>
{

	@Override
	public int compare(FruitApp_sort o1, FruitApp_sort o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
class FruitComparatorDesc implements Comparator<FruitApp_sort>
{

	@Override
	public int compare(FruitApp_sort o1, FruitApp_sort o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
}

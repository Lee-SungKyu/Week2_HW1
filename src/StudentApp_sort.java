// Comparable<T>

public class StudentApp_sort implements Comparable<StudentApp_sort>{
	String name;

	public StudentApp_sort() {}
	public StudentApp_sort(String name) {
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
		return "StudentApp_sort [name=" + name + "]";
	}

	@Override
	public int compareTo(StudentApp_sort o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	
}

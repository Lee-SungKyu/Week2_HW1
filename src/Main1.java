import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<StudentApp_sort> list = new ArrayList<StudentApp_sort>();
		
		list.add(new StudentApp_sort("Kim"));
		list.add(new StudentApp_sort("Choi"));
		list.add(new StudentApp_sort("Park"));
		list.add(new StudentApp_sort("Lee"));
		list.add(new StudentApp_sort("Oh"));
		list.add(new StudentApp_sort("Yu"));
		list.add(new StudentApp_sort("Jeong"));
		list.add(new StudentApp_sort("Han"));
		list.add(new StudentApp_sort("Gang"));
		list.add(new StudentApp_sort("Kai"));
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(list);
		
		for (StudentApp_sort s : list)
		{
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reversed ordered by name)");
		Collections.sort(list, Collections.reverseOrder());
		
		for (StudentApp_sort s : list)
		{
			System.out.println(s.toString());
		}
		
		
	}

}

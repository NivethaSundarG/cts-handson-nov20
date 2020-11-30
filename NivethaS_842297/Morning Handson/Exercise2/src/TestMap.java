import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<student> csStudent = new ArrayList<student>();
		List<student> ecStudent = new ArrayList<student>();
		
		Map<String,List> studentData = new HashMap<String,List>();
		
		csStudent.add(new student(1,"Anitha","CSE"));
		csStudent.add(new student(2,"Sriram","CSE"));
		csStudent.add(new student(3,"jessi","CSE"));
		ecStudent.add(new student(1,"Gowtham","ECE"));
		ecStudent.add(new student(2,"Kishore","ECE"));
		ecStudent.add(new student(3,"kumar","ECE"));
		
		
		studentData.put("CS",csStudent);
		studentData.put("EC",ecStudent);
		
		System.out.println(studentData);
	}

}
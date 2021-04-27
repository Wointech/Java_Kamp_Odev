
public class Course {

	public Course(int id, String name, int teacherId, boolean completionStatus) {

		this.id = id;
		this.name = name;
		this.teacherId = teacherId;
		this.completionStatus = completionStatus;
	}

	int id;
	int teacherId;
	String name;
	boolean completionStatus;
}

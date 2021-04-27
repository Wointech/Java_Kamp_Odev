
public class CourseManager {

	public void add(Course course, Teacher teacher) {

		System.out.println(teacher.firstName + " hocaya ait " + course.name + " Kursu eklendi");

	}

	public void delete(Course course, Teacher teacher) {

		System.out.println(teacher.firstName + " hocaya ait " + course.name + " Kursu silindi");
	}

}

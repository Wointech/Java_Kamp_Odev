
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "C#", 1, true);
		Course course2 = new Course(2, "Java", 2, false);
		Course course3 = new Course(3, "Python", 1, false);
		
		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ", 30);
		Teacher teacher2 = new Teacher(2, "Ömer", "Yıldırım", 40);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1, teacher1);
		
		courseManager.delete(course2, teacher2);
		
		courseManager.add(course3, teacher1);

	}

}

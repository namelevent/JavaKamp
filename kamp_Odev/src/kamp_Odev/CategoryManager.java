package kamp_Odev;


public class CategoryManager {
	
	public void addCourse(CourseName courseName) {
		System.out.println("Kurs Eklendi : " + courseName.courseName);
	}
	
	public void deleteCourse(CourseName courseName) {
		System.out.println("Kurs Silindi : " + courseName.courseName);
	}
	
	public void updateCourse(CourseName courseName) {
		System.out.println("Kurs Güncellendi : " + courseName.courseName);
	}

}

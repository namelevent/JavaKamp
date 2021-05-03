package kamp_Odev;

public class Main {

	public static void main(String[] args) {
		
		Trainers trainer = new Trainers(1,"Levent Öztürk");
		
		CourseName java = new CourseName(2, "Java Kamp");
		
		PercentageOfCompletion percentageOfCompletion = new PercentageOfCompletion(3,59);
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCourse(java);
		categoryManager.deleteCourse(java);
		categoryManager.updateCourse(java);

	}

}

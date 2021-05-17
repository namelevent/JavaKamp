package kamp_Odev;

import kamp_Odev.business.abstracts.UserService;
import kamp_Odev.business.concretes.UserManager;
import kamp_Odev.dataAccess.abstracts.UserDao;
import kamp_Odev.dataAccess.concretes.Facebook;
import kamp_Odev.dataAccess.concretes.Google;
import kamp_Odev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "Levent", "Öztürk", "levento@gmail.com", "12345678");
		User user2 = new User(2, "Ali", "Demir", "Ali19@gmail.com", "87654321");
		User user3 = new User(3, "Mehdi", "Koca", "MehdicanKoca@gmail.com", "3456789");
		User user4 = new User(4, "Muhammed", "Aytaþ", "aytas19@gmail.com", "741852963");
		User user5 = new User(5, "Mehmet", "Özçelik", "Mehmte_ozcelik@hotmail.com", "963852741");
		User user6 = new User(6, "Berat", "Gelp", "gelpBerat@hotmail.com", "789456123");
		User user7 = new User(7, "Nisa", "Meþe", "mesenisa@gmail.com", "321654987");
	
		
		UserService userService = new UserManager(new Google());
		
		System.out.println("**********************User SignUp**********************\n");
		
		userService.signUp(user1);
		userService.signUp(user4);
		userService.signUp(user3);
		userService.signUp(user7);
		userService.signUp(user6);
		
		System.out.println("\n\n**********************User SignIn**********************\n");
		
		userService.signIn("levento@gmail.com", "12345678");
		userService.signIn("aytas19@gmail.com", "741852963");
		userService.signIn("MehdicanKoca@gmail.com", "3456789");
		userService.signIn("mesenisa@gmail.com", "321654987");
		userService.signIn("gelpBerat@hotmail.com", "789456123");
		
	}

}

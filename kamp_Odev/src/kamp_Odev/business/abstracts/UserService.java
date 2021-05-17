package kamp_Odev.business.abstracts;

import kamp_Odev.entities.concretes.User;

public interface UserService {
	
	void signUp(User user);
	void signIn(String mail, String password);
}

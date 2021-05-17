package kamp_Odev.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import kamp_Odev.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void deleteUser(int userId);
	ArrayList<User> getAll();

}

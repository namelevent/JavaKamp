package kamp_Odev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kamp_Odev.dataAccess.abstracts.UserDao;
import kamp_Odev.entities.concretes.User;

public class Facebook implements UserDao {
	
	public ArrayList<User> users;
	
	public Facebook() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("\nKullanýcý Facebook Ýle Eklendi : " + user.getMail() + "\n");
		
	}

	@Override
	public void deleteUser(int userId) {
		int id = users.indexOf(userId);
		users.remove(id);
		System.out.println("Kullanýcý Facebook Ýle Silindi\n");
		
	}

	@Override
	public ArrayList<User> getAll() {
		return this.users;
	}

}

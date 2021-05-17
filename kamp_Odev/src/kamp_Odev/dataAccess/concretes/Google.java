package kamp_Odev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kamp_Odev.dataAccess.abstracts.UserDao;
import kamp_Odev.entities.concretes.User;

public class Google implements UserDao {
	
	private ArrayList<User> users;
	
	public Google() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		System.out.println("\nKullanýcý Google Ýle Eklendi : " + user.getMail() + "\n");
		
	}

	@Override
	public void deleteUser(int userId) {
		int id = users.indexOf(userId);
		this.users.remove(id);
		System.out.println("Kullanýcý Google Ýle Silindi" + "\n");
		
	}
	@Override
	public ArrayList<User> getAll() {
		return this.users;
	}

}

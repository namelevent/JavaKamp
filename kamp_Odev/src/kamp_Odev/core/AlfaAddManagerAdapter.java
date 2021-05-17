package kamp_Odev.core;

import java.util.ArrayList;
import java.util.List;

import kamp_Odev.dataAccess.abstracts.UserDao;
import kamp_Odev.entities.concretes.User;

public class AlfaAddManagerAdapter implements UserDao{
	
private ArrayList<User> users;
	
	public AlfaAddManagerAdapter() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý AlfaAdd Ýle Eklendi.");
		
	}

	@Override
	public void deleteUser(int userId) {
		this.users.remove(userId);
        System.out.println("Kullanýcý AlfaAdd Ýle Silindi.");
	}

	@Override
	public ArrayList<User> getAll() {
		return this.users;
	}

}

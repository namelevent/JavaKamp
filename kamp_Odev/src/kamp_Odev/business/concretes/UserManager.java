package kamp_Odev.business.concretes;


import kamp_Odev.business.abstracts.UserService;
import kamp_Odev.dataAccess.abstracts.UserDao;
import kamp_Odev.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public void signUp(User user) {
		if(user.getFirstName().length() > 2 && user.getLastName().length() > 2 && user.getPassword().length() > 6) {
			userDao.addUser(user);
			System.out.println("Baþarýlý Bir Þekilde Kayýt Oldunuz.");
			System.out.println("Doðrulama Ýçin " + user.getMail() + " Adresine Link Gönderildi");
			System.out.println("Doðrulama Baþarýlý Bir Þekilde Gerçekleþtirildi.");
		}
		else {
			System.out.println("Kayýt Ýþleminde Hataya Rastlandý.");
		}
		
	}
	boolean signIn = false;
	@Override
	public void signIn(String mail, String password) {
		
		for (int i = 0; i < userDao.getAll().size(); i++) {
			if(userDao.getAll().get(i).getMail().equals(mail) && userDao.getAll().get(i).getPassword().equals(password)) {
				signIn = true;
			}
			
			if(signIn == true) {
				System.out.println("\nSisteme Baþarýlý Bir Þekilde Giriþ Yaptýnýz : " + mail);
				break;
			}
			else {
				System.out.println("\nSisteme Giriþinizde Hata Oldu.");
				break;
			}
		}
		
	}

}

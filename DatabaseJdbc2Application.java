package in.rahul.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.rahul.main.dao.dao;
import in.rahul.main.entities.User;

@SpringBootApplication
public class DatabaseJdbc2Application implements CommandLineRunner{
	
	@Autowired
	private dao dao;

	public static void main(String[] args)
	{
		SpringApplication.run(DatabaseJdbc2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	/*	User user1=new User("Manya kumari","Manya@gmail.com","Female","Sarojini East");
	boolean status=	dao.insertUser(user1);
		if(status)
		{
			System.out.println("User inserted Successfully in database");
		}
		else
		{
			System.out.println("user insertion failed");
		}
		
		*/
		
	/*	User user1=new User("kumar Rahul", "Rahul@gmail.com", "Male", "Surat");
	boolean status=	dao.updateUser(user1);
		if(status)
		{
			System.out.println("USer Upadated Successfully in Database");
		}
		else
		{
			System.out.println("User updation failed");
		}
		*/
		
	boolean status=	dao.deleteUserByEmai("sakshi@gmail.com");
	if(status)
	{
		System.out.println("user deleted successfully");
	}
	else
	{
		System.out.println("user deletion failed");
	}
	}

}

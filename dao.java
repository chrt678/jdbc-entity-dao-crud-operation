package in.rahul.main.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.rahul.main.entities.User;

@Repository
public class dao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public boolean insertUser(User user)
	{
		boolean status=false;
		try {
			
			String insert_sql_query="insert into User(name,email,gender,city)values(?,?,?,?)";
		int count=	jdbcTemplate.update(insert_sql_query, user.getName(),user.getEmail(),user.getGender(),user.getCity());
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception ae)
		{
			status=false;
			ae.printStackTrace();
		}
		return status;
	}
	
	
	
	public boolean updateUser(User user)
	{
		boolean status=false;
		try {
			
			String update_sql_query="update User SET name=?,gender=?,city=? where email=?";
		int count=	jdbcTemplate.update(update_sql_query, user.getName(),user.getGender(),user.getCity(),user.getEmail());
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception ae)
		{
			status=false;
			ae.printStackTrace();
		}
		return status;
	}
	
	
	
	public boolean deleteUserByEmai(String email)
	{
		boolean status=false;
		try {
			
			String delete_sql_query="delete from User where email=?";
		int count=	jdbcTemplate.update(delete_sql_query, email);
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception ae)
		{
			status=false;
			ae.printStackTrace();
		}
		return status;
	}
}

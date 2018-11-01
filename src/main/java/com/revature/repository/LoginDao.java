package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import com.revature.model.User;
import com.revature.util.HibernateUtil;

public class LoginDao {

	public User getUserByName(String Uname, String Pword) {
		User found = null;
		List<User> user = new ArrayList<>();
		Session session = HibernateUtil.getSession();
		
		user = session.createQuery("from User where U_UserName = :nameVar and U_PassWord = :passVar").setString("nameVar", Uname).setString("passVar", Pword).list();
		if(!user.isEmpty()) {
			found = user.get(0);
		}
		
		
		return found;
	}
}

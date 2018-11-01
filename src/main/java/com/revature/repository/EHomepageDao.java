package com.revature.repository;

import java.util.List;

import org.hibernate.Session;

import com.revature.model.Reimbursement;
import com.revature.model.User;
import com.revature.util.HibernateUtil;

public class EHomepageDao {

	public List<User> viewInfo(String UserName) {
		
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from User Where U_UserName = :nameVar").setString("nameVar", UserName).list();
	}
	

}

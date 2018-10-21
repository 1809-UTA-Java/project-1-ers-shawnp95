package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.model.User;
import com.revature.util.HibernateUtil;

public class EHomepageUpdateDao {

	public void update(User a) {
		
		Session session = HibernateUtil.getSession();
		
		session.beginTransaction();
		session.update(a);
		session.getTransaction().commit();
		
	}
	
}

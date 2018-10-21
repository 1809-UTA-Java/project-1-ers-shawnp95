package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.revature.model.User;
import com.revature.util.HibernateUtil;

public class EHomepageUpdateDao {

	public List<User> update() {
		
		Session session = HibernateUtil.getSession();
		List<User> user = new ArrayList<>();
		
		
		return null;
	}
	
}

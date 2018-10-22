package com.revature.repository;

import org.hibernate.Session;

import com.revature.model.Reimbursement;
import com.revature.util.HibernateUtil;

public class EHomepageSubmitDao {
	
	public void save(Reimbursement a) {
		
		Session session = HibernateUtil.getSession();
		
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
		
	}
}

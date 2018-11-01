package com.revature.repository;

import java.util.List;

import org.hibernate.Session;

import com.revature.model.Reimbursement;
import com.revature.util.HibernateUtil;

public class EHomepageViewDao {

	public List<Reimbursement> ViewPending(int id){
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from Reimbursement where U_ID_Author = :idVar and RT_Status = 0").setInteger("idVar", id).list();
	}
	
	public List<Reimbursement> ViewResolved(int id){
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from Reimbursement where U_ID_Author = :idVar and RT_Status = 1 or U_ID_Author = :idVar and RT_Status = 2").setInteger("idVar", id).list();
	}
}

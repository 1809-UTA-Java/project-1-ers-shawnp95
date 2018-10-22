package com.revature.repository;

import java.util.List;

import org.hibernate.Session;

import com.revature.model.Reimbursement;
import com.revature.model.User;
import com.revature.util.HibernateUtil;

public class MHomepageDao {

	public List<User> viewAll(){
		
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from User where UR_ID = 101").list();
	}
	
	public List<Reimbursement> viewAllP(){
		
		Session session = HibernateUtil.getSession();
		//from ers_reimbursements inner join ers_users on ers_reimbursements.U_ID_Author = ers_users.U_ID
		//return session.createQuery("from Reimbursement inner join com.revature.model.User on Reimbursement.U_ID_Author = User.U_ID").list();
		//return session.createQuery("from Reimbursement on res inner join User on us where res.U_ID_Author = us.U_ID").list();
		return session.createQuery("from Reimbursement where RT_Status = 0").list();
	}
	
	public List<Reimbursement> viewAllR(){
		
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from Reimbursement where RT_Status = 1 or RT_Status = 2").list();
	}
	
	public List<Reimbursement> empId(String id){
		
		Session session = HibernateUtil.getSession();
		
		return session.createQuery("from Reimbursement where U_ID_Author = :idVar").setString("idVar", id).list();
	}
}

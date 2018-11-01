package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.revature.model.Reimbursement;
import com.revature.model.User;
import com.revature.repository.EHomepageSubmitDao;
import com.revature.util.HibernateUtil;

public class EHomepageSubmitServlet extends HttpServlet{

	EHomepageSubmitDao dao = new EHomepageSubmitDao();
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Session session = HibernateUtil.getSession();
		PrintWriter pw = resp.getWriter();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
		
		String arg1 = req.getParameter("R_ID");
		String arg2 = req.getParameter("R_Amount");
		String arg3 = req.getParameter("R_Description");
		String arg4 = req.getParameter("RT_Type");
		
		User U = (User) getServletContext().getAttribute("user");
		Reimbursement R = new Reimbursement();
		
		
		
		if (arg1.isEmpty()) {
			pw.print("No Id in field");
		}
		else {
			R.setR_ID(Integer.valueOf(arg1));
		}
		
		if (arg2.isEmpty()) {
			pw.print("No Amount in field");
		}
		else {
			R.setR_Amount(Double.valueOf(arg2));
		}
		
		if (arg3.isEmpty()) {
			pw.print("No Description in field");
		}
		else {
			R.setR_Description(arg3);
		}
		
		if (arg4.isEmpty()) {
			pw.print("No Type in field");
		}
		else if(arg4.equalsIgnoreCase("Traveling")) {
			R.setRT_Type(0);
		}
		else if(arg4.equalsIgnoreCase("Food")) {
			R.setRT_Type(1);
		}
		//else {
			//R.setRT_Type(Integer.valueOf(arg4));
		//}
		
		R.setU_ID_Author(U.getU_ID());
		//R.setU_ID_Resolver((Integer) null);
		R.setR_Submitted("10/22/2018");
		R.setR_Resolved(null);
		
		dao.save(R);
		pw.print("Submit Successful!");
	}
}

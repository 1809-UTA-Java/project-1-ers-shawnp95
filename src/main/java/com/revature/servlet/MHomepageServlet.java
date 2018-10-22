package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Reimbursement;
import com.revature.model.User;
import com.revature.repository.MHomepageDao;

public class MHomepageServlet extends HttpServlet{

	List<User> U;
	List<Reimbursement> R;
	MHomepageDao dao = new MHomepageDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//User user = (User) getServletContext().getAttribute("user");
		U = dao.viewAll();
		
		PrintWriter pw = resp.getWriter();
		pw.print(U);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Session session = HibernateUtil.getSession();
		PrintWriter pw = resp.getWriter();
		
		String arg1 = req.getParameter("EmployerId");
		
		R = dao.empId(arg1);
		pw.print(R);
	}
}

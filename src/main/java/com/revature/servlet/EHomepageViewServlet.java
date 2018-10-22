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
import com.revature.repository.EHomepageViewDao;
import com.revature.util.HibernateUtil;

public class EHomepageViewServlet extends HttpServlet{
	
	List<Reimbursement> R;
	EHomepageViewDao dao = new EHomepageViewDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = (User) getServletContext().getAttribute("user");

		R = dao.ViewResolved(user.getU_ID());
		
		PrintWriter pw = resp.getWriter();
		pw.print(R);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = (User) getServletContext().getAttribute("user");
		
		R = dao.ViewPending(user.getU_ID());
		PrintWriter pw = resp.getWriter();
		pw.print(R);
	}
	
	public void destroy() {
		HibernateUtil.shutdown();
	}
}

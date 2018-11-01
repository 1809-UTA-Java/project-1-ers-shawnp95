package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.revature.model.User;
import com.revature.repository.EHomepageUpdateDao;
import com.revature.util.HibernateUtil;

public class EHomepageUpdateServlet extends HttpServlet {

	
	EHomepageUpdateDao dao = new EHomepageUpdateDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session = HibernateUtil.getSession();
		PrintWriter pw = resp.getWriter();

		String arg1 = req.getParameter("Username");
		String arg2 = req.getParameter("Password");
		String arg3 = req.getParameter("Firstname");
		String arg4 = req.getParameter("Lastname");
		String arg5 = req.getParameter("Email");

		User user = (User) getServletContext().getAttribute("user");

		if (arg1.isEmpty()) {

			pw.print("No Username in Field");
		} 
		
		else {
			user.setU_UserName(arg1);
		}
		
		if (arg2.isEmpty()) {

			pw.print("No Password in Field");
		} 
		
		else {
			user.setU_PassWord(arg2);
		}
		
		if (arg3.isEmpty()) {

			pw.print("No Firstname in Field");
		} 
		
		else {
			user.setU_FirstName(arg3);
		}
		
		if (arg4.isEmpty()) {

			pw.print("No Lastname in Field");
		} 
		
		else {
			user.setU_LastName(arg4);
		}
		
		if (arg5.isEmpty()) {

			pw.print("No Email in Field");
		} 
		
		else {
			user.setU_Email(arg5);
		}
		
		dao.update(user);
		getServletContext().setAttribute("user",user);
		pw.print("Information has been updated!");
	}
}

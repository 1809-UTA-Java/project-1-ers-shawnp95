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
import com.revature.util.HibernateUtil;

public class EHomepageUpdateServlet extends HttpServlet{

	List<User> U;
	
	@Override
	protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session = HibernateUtil.getSession();
		
		String arg1 = req.getParameter("Username");
		String arg2 = req.getParameter("Password");
		String arg3 = req.getParameter("Firstname");
		String arg4 = req.getParameter("Lastname");
		String arg5 = req.getParameter("Email");
		
		User user = (User) getServletContext().getAttribute("user");
		
		user.setU_UserName(arg1);
		user.setU_PassWord(arg2);
		user.setU_FirstName(arg3);
		user.setU_LastName(arg4);
		user.setU_Email(arg5);
		
		session.update(user);

		PrintWriter pw = resp.getWriter();
		pw.print("Information has been updated!");
	}
}

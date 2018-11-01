package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.revature.model.User;
import com.revature.repository.LoginDao;
import com.revature.util.HibernateUtil;

public class LoginServlet extends HttpServlet{
	
	LoginDao dao = new LoginDao();
	User user = new User();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		String arg1 = req.getParameter("Username");
		String arg2 = req.getParameter("Password");
		//Session session = HibernateUtil.getSession();

	//	((HttpSession) session).setAttribute("username", arg1);
		user = dao.getUserByName(arg1, arg2);
		
		if(user != null) {
			//req.setAttribute(arg1, p);
			//req.setAttribute(arg2, p);
			//getServletContext();
			//req.setAttribute("user", user);
			getServletContext().setAttribute("user", user);
			if(user.getUR_ID() == 101) {
				resp.sendRedirect("EHomepage.html");
			}
			else
			resp.sendRedirect("MHomepage.html");
		}
		
		//if(dao.getUserByName(arg1, arg2) != null) {
			//resp.sendRedirect("EHomepage.html");
		//}

		else {
			pw.println("Incorrect Username or Password");
		}
		
		pw.close();
	}
}
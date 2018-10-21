package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.User;
import com.revature.repository.EHomepageDao;

public class EHomepageServlet extends HttpServlet{

	//User p = new User();
	
	List<User> U;
	EHomepageDao dao = new EHomepageDao();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.getAttribute("user");
		
		User user = (User) getServletContext().getAttribute("user");

		U = dao.viewInfo(user.getU_UserName());
		
		PrintWriter pw = resp.getWriter();
		pw.print(U);
	}
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect("EHomepageUpdate.html");
	}*/
}

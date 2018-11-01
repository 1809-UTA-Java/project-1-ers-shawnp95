package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Reimbursement;
import com.revature.repository.MHomepageDao;

public class MHomepageViewServlet extends HttpServlet{

	List<Reimbursement> R;
	MHomepageDao dao = new MHomepageDao();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		R = dao.viewAllP();
		PrintWriter pw = resp.getWriter();
		pw.print(R);
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		R = dao.viewAllR();
		PrintWriter pw = resp.getWriter();
		pw.print(R);
	}
}

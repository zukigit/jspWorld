package com.sessionAndCookie;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class postSession extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		
		HttpSession ses = req.getSession();
		ses.setAttribute("name", name);
		
		res.sendRedirect("gs");
	}
}

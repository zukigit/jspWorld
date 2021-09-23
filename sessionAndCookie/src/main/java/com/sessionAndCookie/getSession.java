package com.sessionAndCookie;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class getSession extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession ses = req.getSession();
		String name = (String) ses.getAttribute("name");
		System.out.println(name);
	}
}

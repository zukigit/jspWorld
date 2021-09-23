package com.sessionAndCookie;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class postCookie extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		
		Cookie cookie = new Cookie("name", name);
		res.addCookie(cookie);
		
		res.sendRedirect("gc");
	}
}

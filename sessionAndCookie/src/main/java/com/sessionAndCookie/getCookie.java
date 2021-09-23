package com.sessionAndCookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getCookie extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		Cookie[] sendNames = req.getCookies();
		String name = "";
		for (Cookie c : sendNames) {
			if( c.getName().equals("name")){
				name = c.getValue();
			}
		}
		
		System.out.println(name);
	}
}

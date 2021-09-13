package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class result extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		
		Object result = req.getAttribute("result") ;
		
		if (result == "error") {
			out.print("try again");
		}
		else
			out.print("result is "+ result);
	}

}

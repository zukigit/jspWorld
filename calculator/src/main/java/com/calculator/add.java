package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int num1 = Integer.parseInt(req.getParameter("num1")) ;
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String operator = req.getParameter("operator");
		
		switch (operator) {
		case "+" : {
			int sum = num1 + num2;
			req.setAttribute("result", sum);
			}; break;
		case "-" : {
			int sum = num1 - num2;
			req.setAttribute("result", sum);
			}; break;
		case "*" : {
			int sum = num1 * num2;
			req.setAttribute("result", sum);
			}; break;
		case "/" : {
			int sum = num1 / num2;
			req.setAttribute("result", sum);
			}; break;
		default: req.setAttribute("result", "error");
		}
		
		
		RequestDispatcher send = req.getRequestDispatcher("resultPage");
		send.forward(req, res);
		
	}
}

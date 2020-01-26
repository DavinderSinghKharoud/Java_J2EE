package com.kharoud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/demo")
public class AddServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String name = "Sunny";
		
		req.setAttribute("name", "value");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
//		dispatcher.forward(req, res);
		
		req.setAttribute("name", "value");
		req.getRequestDispatcher("page.jsp").forward(req, res);
	}
	
}

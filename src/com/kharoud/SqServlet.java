package com.kharoud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		
		Cookie cookie[] = req.getCookies();
		
		int k = 0;
		for(Cookie ele: cookie) {
			
			if( ele.getName().equals("k")) {
				k = Integer.parseInt(ele.getValue());
			}
		}
		k = k*k;
		PrintWriter out = res.getWriter();
		out.print("Square is:"+k);
		
	}

}

package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/quiz05")
public class quiz05 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		//request Parameter
		int number=Integer.parseInt(request.getParameter("number"));
		PrintWriter out=response.getWriter();
		String str="<html><head></head><body><hr><ul>";
		for(int i=1;i<=9;i++) {
			int mul=i*number;
			String a="<li>"+number+" X "+i+" = "+mul+"</li>";
			str+=a;
		}
		str+="</ul></body></html>";
		out.print(str);
		
	}
}

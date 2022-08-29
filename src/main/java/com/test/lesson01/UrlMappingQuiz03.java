package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/UrlMappingQuiz03")
public class UrlMappingQuiz03 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String printstring="<html><head><title>LIST</title></head><body><ul>";
		for(int i=0;i<30;i++) {
			String a=(i+1)+"번째 리스트";
			printstring+="<li>"+a+"</li>";
		}
		printstring+="</ul></body></html>";
		out.print(printstring);
	}
	
}

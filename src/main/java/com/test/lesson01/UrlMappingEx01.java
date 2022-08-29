package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/plain");
	Date now=new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일"); 
	//출처: https://junghn.tistory.com/entry/JAVA-자바-날짜-포맷-변경-방법SimpleDateFormat-yyyyMMdd [코딩 시그널:티스토리]
	PrintWriter out = response.getWriter();
    out.println("안녕하세요!!!");
    out.println(now);
    String strNowDate = simpleDateFormat.format(now); 
    //출처: https://junghn.tistory.com/entry/JAVA-자바-날짜-포맷-변경-방법SimpleDateFormat-yyyyMMdd [코딩 시그널:티스토리]
    out.println(strNowDate);
}
}
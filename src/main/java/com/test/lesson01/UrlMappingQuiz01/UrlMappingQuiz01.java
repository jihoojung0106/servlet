package com.test.lesson01.UrlMappingQuiz01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/plain");
	Date now=new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 M월 dd일"); 
	SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("HH시 mm분 ss초");
	PrintWriter out = response.getWriter();
    String strNowDate = "오늘의 날짜는 "+ simpleDateFormat.format(now); 
    String strNowTime = "현재 시간은 "+ simpleTimeFormat.format(now)+" 입니다."; 
    out.println(strNowDate);
    out.println(strNowTime);
}}
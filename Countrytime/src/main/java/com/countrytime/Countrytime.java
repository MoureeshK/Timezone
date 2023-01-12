package com.countrytime;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.TimeZone;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//
//@WebServlet("/Countrytime")
//public class Countrytime extends HttpServlet {
//
//	public void service(ServletRequest Rq, ServletResponse Rp) throws IOException {
//		Rp.setContentType("text/html");
//		PrintWriter out = Rp.getWriter();
//		try {
//		String country = Rq.getParameter("country");
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		sdf.setTimeZone(TimeZone.getTimeZone(country));
//		sdf.applyPattern("dd MMM yyyy HH:mm:ss z");
//		String Time = sdf.format(Calendar.getInstance().getTime());
//		RequestDispatcher reqDisp = Rq.getRequestDispatcher("/index.html");
//		reqDisp.include(Rq, Rp);
//		out.println("<h3>"+Time+"</h3>");
//		}
//		catch(Exception ee) {
//			out.print(ee);
//		}
//	}
//}
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.Calendar;
import java.util.TimeZone;
@WebServlet("/time")
public class Countrytime extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest Rq, ServletResponse Rp) throws IOException {
		Rp.setContentType("text/html");
		PrintWriter out = Rp.getWriter();
		try {
		String country = Rq.getParameter("country");
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.setTimeZone(TimeZone.getTimeZone(country));
		sdf.applyPattern("dd MMM yyyy HH:mm:ss z");
		String Time = sdf.format(Calendar.getInstance().getTime());
		RequestDispatcher reqDisp = Rq.getRequestDispatcher("/index.html");
		reqDisp.include(Rq, Rp);
		out.println("<h3>"+Time+"</h3>");
		}
		catch(Exception ee) {
			out.print(ee);
		}
	}
}
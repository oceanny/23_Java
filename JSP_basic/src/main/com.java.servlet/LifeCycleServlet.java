package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
       
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		String initParam = config.getInitParameter("name");
		String initParam2 = config.getInitParameter("name2");
		System.out.println("initParam : " + initParam);
		System.out.println("initParam2 : " + initParam2);
	}
	
//	do가 붙은 메소드는 사용자 요청이 왔을 때 실행되는 메소드를 뜻함
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut()");
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doDelete()");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}
	
}

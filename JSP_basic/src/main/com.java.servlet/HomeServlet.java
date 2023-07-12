package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// uri 설정 : exe/gugudan.html에 접속 시 com.java.servlet.HomeController에 접속하는 것과 동일
@WebServlet("/exe/gugudan.html")
public class HomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Gugudan gugudan = new Gugudan();
//		웹에서 출력 가능하도록 오버라이드 & PrintWriter 이용
//		UTF-8로 인코딩
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		gugudan.exe(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}

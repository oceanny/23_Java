package com.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/scriptlet")
public class ScriptletServlet extends HttpServlet {
	private String id = "mimi";
	private String pwd = "mimi";

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		jsp_Service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		jsp_Service(request, response);
	}

	public final void jsp_Service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + pwd);
		
		setId(request.getParameter("id"));
		setPwd(request.getParameter("pwd"));
		
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + pwd);
//		싱글톤 패턴이라 한 번 아이디와 패스워드에 null이 들어가니까 계속 null로 출력
//		인스턴스 새로 생성할 때만 mimi로 초기화 됨
	}
}

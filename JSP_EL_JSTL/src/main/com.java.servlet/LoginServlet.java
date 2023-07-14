package com.java.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.exception.InvalidPasswordException;
import com.java.exception.NotFoundIdException;
import com.java.service.StudentService;
import com.jsp.service.StudentServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
//	java에서 jar 파일을 export 해서 service 기능을 제공할 수 있게 됨
//	입출력을 외부로 하기 위함
	private StudentService stuService = new StudentServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/loginForm.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/login_result.jsp";
		String stuNum = request.getParameter("stuNum");
		String pwd = request.getParameter("pwd");
		
		try {
			HttpSession session = request.getSession();
			((StudentServiceImpl)stuService).login(stuNum, pwd, session);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NotFoundIdException | InvalidPasswordException e) {
			request.setAttribute("message", e.getMessage());
			url = "/loginForm.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}

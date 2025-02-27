package com.kh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet3
 */
@WebServlet("/test3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String city = request.getParameter("city");
		String height = request.getParameter("height");
		
		// 복수개의 정보를 받을 때는 배열로
		String[] foodArr = request.getParameterValues("food");
		
		// JSP에게 html 코드를 작성할 수 있도록 위임
		// request 객체 속성에 변수 지정.
		// void javax.servlet.ServletRequest.setAttribute(String key, Object value)
		
		request.setAttribute("name", name);
		request.setAttribute("gender", gender);
		request.setAttribute("age", age);
		request.setAttribute("city", city);
		request.setAttribute("height", height);
		String foods = "";
		if(foodArr != null) {
			foods = String.join(", ", foodArr); // 문자열 합치기
		} else {
			foods = "없음";
		}
		request.setAttribute("foods", foods);
		
		// 위임 객체 > RequestDispatcher 클래스
		
		// 뷰 선택
		RequestDispatcher view = request.getRequestDispatcher("views/testServlet3End.jsp");
		view.forward(request, response);
		
		// jsp는 html이 아니라 servlet에서 out.println.. 등의 자바 표현으로 html로
		// 작성하는 것이 불편하므로 html 형식으로 코드를 짤 수 있게 해주는 부분
		// html과 자바코드 분리해서 작성 가능 -> servlet으로 자동으로 컴파일됨 (servlet화)
		
		/* RequestDispatcher : 현재 request에 담긴 정보를 저장하고 있다가 그 다음
		 * 페이지, 그 다음 페이지에도 해당 정보를 볼 수 있게 저장하는 기능
		 * 
		 * forward 방식 : 기본 파라미터 정보를 유지하며 페이지 전환
		 * A.jsp -> Servlet -> B.jsp일 때,
		 * A가 가지고 있는 파라미터 정보를 가지고 B로 넘겨줌
		 * request와 response 객체를 공유
		 * 
		 * WebContainer 차원에서 페이지 이동만 있고
		 * 실제로 웹 브라우저는 다른 페이지로 이동 했음을 알 수 없어
		 * 웹 브라우저에는 최초에 호출한 URL이 표시되고 이동한 페이지의 URL 정보는 볼 수 없음
		 * 
		 * 별도로 sendRedirect 방식이 있는데
		 * 이는 모든 파라미터 정보를 제외하고 단순 페이지 호출만 하는 것
		 * 새로운 페이지에서는 request와 response 객체가 새롭게 생성됨
		 * */
		 //response.sendRedirect("views/testServlet3End.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

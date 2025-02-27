package com.kh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PizzaServlet
 */
@WebServlet("/confirmPizza")
public class PizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전달 값이 한글이 있을 경우를 대비하여 인코딩 작업
		request.setCharacterEncoding("UTF-8");
		
		String pizza = request.getParameter("pizza");
		String[] toppings = request.getParameterValues("topping");
		
		int total = 0;
		String topping = "";
		
		switch(pizza) {
		case "치즈피자" : total += 5000; break;
		case "콤비네이션피자" : total += 6000; break;
		case "포테이토피자" : total += 7000; break;
		case "고구마피자" : total += 8000; break;
		case "불고기피자" : total += 9000; break;
		}
		if(toppings != null) {
			topping = String.join(", ", toppings);
			for(int i = 0; i < toppings.length; i++) {
				switch(toppings[i]) {
				case "고구마무스" : total += 1000; break;
				case "콘크림무스" : total += 1500; break;
				case "파인애플토핑" : total += 2000; break;
				case "치즈토핑" : total += 2000; break;
				case "치즈크러스트" : total += 2000; break;
				case "치즈바이트" : total += 3000; break;
				}
			}
		}
		// jsp에게 위임하기 위해 다시 request에 내가 전달하고자 하는 값 속성으로 담기
		request.setAttribute("pizza", pizza);
		request.setAttribute("topping", topping);
		request.setAttribute("total", total);
		
		RequestDispatcher view = request.getRequestDispatcher("views/04_pizzaPayment.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

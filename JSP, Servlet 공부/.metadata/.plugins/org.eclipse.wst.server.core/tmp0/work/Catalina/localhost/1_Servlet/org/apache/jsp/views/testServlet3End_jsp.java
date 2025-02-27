/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-10-01 01:20:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testServlet3End_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!--  이 페이지의 언어는 java언어이다.\r\n");
      out.write("\t  contentType은 문서형식이 html이고 인코딩은 UTF-8이다. 를 알리는 부분 -->\r\n");
      out.write("\r\n");
  // <% 스크립틀릿이라고 해서 이 안에 java 코드를 작성할 수 있다.
	// TestServlet3.java에서 이쪽으로 위임하기 위해 request 객체에 setAttribute로 
    // 데이터를 담아줌. 꺼내올 때는 getAttribute를 사용 -> Object 반환하므로 강제 형변환
    String name = (String)request.getAttribute("name");
    String age = (String)request.getAttribute("age");
    String city = (String)request.getAttribute("city");
    String height = (String)request.getAttribute("height");
    String gender = (String)request.getAttribute("gender");
    String food = (String)request.getAttribute("foods");
    
    // 페이지 로딩과 동시에 가져오기 위해 보통 꺼내는 부분은 위쪽에서 작업함

      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("\tgetParameter\r\n");
      out.write("\t: 클라이언트의 HTML 페이지에서 필요한 정보를 얻는데 사용\r\n");
      out.write("\t    웹 브라우저에서 전송 받은 request 영역에서 name 값이 같은 것을 찾아 값을 읽어옴\r\n");
      out.write("\t    항상 String 반환\r\n");
      out.write("\t\r\n");
      out.write("\tgetAttribute\r\n");
      out.write("\t: 이전에 다른 JSP 또는 Servlet 페이지에 설정 된 매개변수를 가져오는데 사용\r\n");
      out.write("\t  request.setAttribute에서 설정해준 값을 가져오며 설정이 없으면 무조건 null\r\n");
      out.write("\t  Object 반환\r\n");
      out.write(" -->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\th2{color:red;}\r\n");
      out.write("\tspan.name {color:orange; font-weight:bold;}\r\n");
      out.write("\tspan.gender {color:yellow; font-weight:bold;}\r\n");
      out.write("\tspan.age {color:green; font-weight:bold;}\r\n");
      out.write("\tspan.city {color:blue; font-weight:bold;}\r\n");
      out.write("\tspan.height {color:navy; font-weight:bold;}\r\n");
      out.write("\tspan.food {color:purple; font-weight:bold;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>개인 취향 테스트 결과(POST)</h2>\r\n");
      out.write("\t<span class='name'>");
      out.print( name );
      out.write("</span>님은\r\n");
      out.write("\t<span class='age'>");
      out.print(age );
      out.write("</span>이시며, \r\n");
      out.write("\t<span class='city'>");
      out.print(city );
      out.write("</span>에 사는\r\n");
      out.write("\t키<span class='height'>");
      out.print(height );
      out.write("</span>cm인\r\n");
      out.write("\t<span class='gender'>");
      out.print( gender );
      out.write("</span>입니다.\r\n");
      out.write("\t좋아하는 음식은 <span class='food'>");
      out.print(food );
      out.write("</span>입니다.\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

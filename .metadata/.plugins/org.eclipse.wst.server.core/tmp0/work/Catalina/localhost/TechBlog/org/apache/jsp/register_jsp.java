/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.16
 * Generated at: 2022-03-05 04:44:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/normal_navbar.jsp", Long.valueOf(1646379348147L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Register page</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"css/mystyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("		\r\n");
      out.write("	.banner-background{\r\n");
      out.write("	\r\n");
      out.write("		clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("									<!-- Navbar -->  \r\n");
      out.write("		\r\n");
      out.write("						");
      out.write(" <nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-asterisk\"></span> Tech Blog</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-bell-o\"></span> Full Stack Development With Tushar<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("     \r\n");
      out.write("      <li class=\"nav-item dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><span class=\"	fa fa-check-square-o\"></span>\r\n");
      out.write("          Catagory\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming language</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Small Projects implementation</a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Implement OOPS using JAVA with Data Structures and Beyond</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Become a back-end expert</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Implement Frameworks the DevOps way</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Develop a Web Application using frontend stack</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Testing in a DevOps Lifecycle</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data structure</a>\r\n");
      out.write("          <div class=\"dropdown-divider\"></div>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Full Stack Java Developer Capstone Project</a>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("       <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-card-o\"></span> Contact us</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"login_page.jsp\"><span class=\"fa fa-user-circle\"></span> Login</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"register.jsp\"><span class=\"fa fa-user-plus\"></span> Sign Up</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("										<!-- Registration form -->\r\n");
      out.write("\r\n");
      out.write("		<main class=\"primary-background p-5 banner-background\">\r\n");
      out.write("			<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("							<div class=\"card-header text-center primary-background text-white\">\r\n");
      out.write("						    <span class=\"fa fa-user-circle fa-3x\"></span>\r\n");
      out.write("						    <br>\r\n");
      out.write("								Register here\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card-body\">\r\n");
      out.write("							      <form id=\"reg-form\" action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("							      \r\n");
      out.write("							      <div class=\"form-group\">\r\n");
      out.write("								    <label for=\"user_name\">User name</label>\r\n");
      out.write("								    <input name=\"user_name\" type=\"text\" class=\"form-control\" id=\"user_name\" aria-describedby=\"emailHelp\" placeholder=\"Enter your name\">\r\n");
      out.write("								  </div>\r\n");
      out.write("							      \r\n");
      out.write("							      \r\n");
      out.write("								  <div class=\"form-group\">\r\n");
      out.write("								    <label for=\"exampleInputEmail1\">Email address</label>\r\n");
      out.write("								    <input name=\"user_email\" type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\r\n");
      out.write("								    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								  \r\n");
      out.write("								  <div class=\"form-group\">\r\n");
      out.write("								    <label for=\"exampleInputPassword1\">Password</label>\r\n");
      out.write("								    <input name=\"user_password\" type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								  <div class=\"form-group\">\r\n");
      out.write("								    <label for=\"gender\">Select Gender</label>\r\n");
      out.write("								    <br> \r\n");
      out.write("								    <input type=\"radio\"  id=\"gender\" name=\"gender\" value=\"male\">Male\r\n");
      out.write("									<input type=\"radio\"  id=\"gender\" name=\"gender\" value=\"Female\">Female\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								  <div class=\"form-group\">\r\n");
      out.write("								    <textarea name=\"about\" class=\"form-control\"rows=\"5\"  placeholder=\"Enter something about you...\"></textarea>\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								  \r\n");
      out.write("								  <div class=\"form-check\">\r\n");
      out.write("								    <input name=\"check\" type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\r\n");
      out.write("								    <label class=\"form-check-label\" for=\"exampleCheck1\">Agree terms and conditions</label>\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								  <br>\r\n");
      out.write("								  \r\n");
      out.write("								  <div class=\"container text-center\" id=\"loader\" style=\"display:none;\">\r\n");
      out.write("								  	<span class=\"fa fa-refresh fa-spin fa-4x\"></span>\r\n");
      out.write("								  	<h4>Please wait...</h4>\r\n");
      out.write("								  </div>\r\n");
      out.write("								  <div class=\"container text-center\">\r\n");
      out.write("								<button id=\"submit-btn\" type=\"submit\" class=\"btn btn-primary \">Sign Up</button>\r\n");
      out.write("								  </div>\r\n");
      out.write("								  \r\n");
      out.write("								</form>\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("					\r\n");
      out.write("					</div>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		</main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("															<!-- Java Script -->\r\n");
      out.write("  \r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/myjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	$(document).ready(function (){\r\n");
      out.write("		console.log(\"document loaded\")\r\n");
      out.write("		\r\n");
      out.write("		$('#reg-form').on('submit',function(event){\r\n");
      out.write("			event.preventDefault();\r\n");
      out.write("			\r\n");
      out.write("			let form= new FormData(this);\r\n");
      out.write("			\r\n");
      out.write("			$(\"#submit-btn\").hide();\r\n");
      out.write("			$(\"#loader\").show();\r\n");
      out.write("			\r\n");
      out.write("			/* sent to register servlet */\r\n");
      out.write("			\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url: \"RegisterServlet\",\r\n");
      out.write("				type:'POST',\r\n");
      out.write("				data:form,\r\n");
      out.write("				success: function (data,textStatus,jqXHR){\r\n");
      out.write("					console.log(data)\r\n");
      out.write("					\r\n");
      out.write("					$(\"#submit-btn\").show();\r\n");
      out.write("					$(\"#loader\").hide();\r\n");
      out.write("					\r\n");
      out.write("					if(data.trim() ===\"Done\")\r\n");
      out.write("					{\r\n");
      out.write("					swal(\"Successfully Registered...We are going to redirect you to login page\")\r\n");
      out.write("					.then((value) => {\r\n");
      out.write("					  window.location=\"login_page.jsp\"\r\n");
      out.write("					});\r\n");
      out.write("					}else{\r\n");
      out.write("						swal(data);	\r\n");
      out.write("					}\r\n");
      out.write("				},\r\n");
      out.write("				error: function (jqXHR, textStatus, errorThrown){\r\n");
      out.write("					\r\n");
      out.write("					$(\"#submit-btn\").show();\r\n");
      out.write("					$(\"#loader\").hide();\r\n");
      out.write("					swal(\"Somthing went wrong...try again\");\r\n");
      out.write("					\r\n");
      out.write("				},\r\n");
      out.write("				processData: false,\r\n");
      out.write("				contentType: false\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

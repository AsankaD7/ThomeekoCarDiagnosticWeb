package org.apache.jsp.WEB_002dINF.WEB;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/MainStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:700|Raleway|Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Indie+Flower' rel='stylesheet' type='text/css'>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(IMAGE/bcground.jpg);background-size: cover\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MAIN/LognInTop.jsp", out, false);
      out.write("\n");
      out.write("        <!--<img src=\"../RES/IMAGE/bcground.jpg\" alt=\"\"/>-->\n");
      out.write("        ");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"head-line\"><center>THOMEEKO CAR DIAGNOSTIC</center></div>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"login-div\">\n");
      out.write("                        <div class=\"member-login\">Member Login</div>\n");
      out.write("\n");
      out.write("                        <br/>\n");
      out.write("                        <form action=\"addLogIn\" method=\"POST\">\n");
      out.write("                            <label for=\"selectbasic\">User Name</label>\n");
      out.write("                            <input name=\"username\" type=\"text\"  class=\"form-control text-f\" style=\"border-radius: 0px\" placeholder=\"Name ?\"/>\n");
      out.write("                            <label for=\"selectbasic\">Password</label>\n");
      out.write("                            <input name=\"password\" type=\"password\" class=\"form-control text-f\" style=\"border-radius: 0px\" placeholder=\"Password ?\" />\n");
      out.write("                            <input style=\"margin-top: 5px;width: 100%;margin: 10px\"  type=\"submit\" class=\"btn btn-primary\" value=\"Login\">\n");
      out.write("                        </form>\n");
      out.write("                        <br/>\n");
      out.write("                        <!--<a href=\"signIn\">Create new account?</a>-->\n");
      out.write("                        <br/>\n");
      out.write("                        <br/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MAIN/Bottom.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

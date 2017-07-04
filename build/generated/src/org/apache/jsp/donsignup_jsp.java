package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"silver\">\n");
      out.write("        <h1>Donor Login</h1>\n");
      out.write("        <h2>Sign UP</h2>\n");
      out.write("        <form name=\"f1\" action = \"loginservlet\" method = \"POST\">\n");
      out.write("                  <label>Name:</label><input type = \"text\" name = \"firstname\"id=\"name\" class = \"box\"><br /><br />\n");
      out.write("                  <label>Blood group</label><input type = \"text\" name = \"bgroup\"id=\"bgroup\" class = \"box\" ><br/><br />\n");
      out.write("                  <label>Contact</label><input type = \"text\" name = \"contact\"id=\"contact\" class = \"box\"><br /><br />\n");
      out.write("                 <label>UserName:</label><input type = \"text\" name = \"firstname\"id=\"username\" class = \"box\"><br /><br />\n");
      out.write("                  <label>Password :</label><input type = \"password\" name = \"password\" id=\"password\" class = \"box\" ><br/><br />\n");
      out.write("                  <label>Confirm password :</label><input type = \"password\" name = \"cpassword\" id=\"cpassword\" class = \"box\" ><br/><br />\n");
      out.write("                  <input type = \"Submit\" value = \" Submit \">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

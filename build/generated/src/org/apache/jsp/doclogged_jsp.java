package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doclogged_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>DOCTOR LOGIN</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"grey\">\n");
      out.write("        <form name=\"r\" action=\"requestservelet\" method=\"POST\">\n");
      out.write("       <table border=\"1\">\n");
      out.write("            <thead> <h2>  REQUIREMENTS</h2>\n");
      out.write("                 \n");
      out.write("                <tr>\n");
      out.write("                    <th>REGION</th>\n");
      out.write("                    <th>BLOOD GROUP</th>\n");
      out.write("                    <th>HOSPITAL</th>\n");
      out.write("                    <th>PATIENT NAME</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("           \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>KOTTAYAM</td>\n");
      out.write("                    <td>AB +VE</td>\n");
      out.write("                    <td>MATHA</td>\n");
      out.write("                    <td>MARY</td>\n");
      out.write("                </tr>\n");
      out.write("             \n");
      out.write("            </tbody>\n");
      out.write("       </table> <br> <br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead> <h2> DONOR DETAILS </h2>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>NAME</th>\n");
      out.write("                    <th>BLOOD GROUP</th>\n");
      out.write("                    <th>CONTACT</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <input type=\"radio\" name=\"A\" value=\"1\" />1</td>\n");
      out.write("                   <td>RAKESH</td>\n");
      out.write("                    <td>O +VE</td>\n");
      out.write("                    <td>9809079827</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <input type=\"radio\" name=\"A\" value=\"1\" /> 2</td>\n");
      out.write("                    <td>Mukesh</td>\n");
      out.write("                    <td>A +ve</td>\n");
      out.write("                    <td>9980989057</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("             <input type=\"submit\" value=\"REQUEST\" name=\"REQUEST\" />\n");
      out.write("      </form>\n");
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

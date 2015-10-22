package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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

      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("    Â© 2015 Maddie Chili, Davis Rumley, Zane Laughery\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>CSC330 Homework 2</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles/main.css\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Future Value Calculator</h1>\n");
      out.write("\n");
      out.write("<form id=\"email-form\" name=\"email-form\" action=\"calculate2\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"add\">        \n");
      out.write("    <label for=\"investment\">Investment Amount</label>\n");
      out.write("    <input type=\"number\" id=\"investment\" name=\"investment\" min=\"0\" required><br>\n");
      out.write("    <label for=\"rate\">Yearly Interest Rate</label>\n");
      out.write("    <input type=\"number\" id=\"rate\" name=\"rate\" min=\"0\" required><br>\n");
      out.write("    <label for=\"years\">Number of Years</label>\n");
      out.write("    <input type=\"number\" id=\"years\" name=\"years\" min=\"0\" placeholder=\"Integer number of years\" required><br> \n");
      out.write("    \n");
      out.write("    <input type=\"submit\" id=\"calculate\" value=\"Calculate\">\n");
      out.write("</form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("<p>&copy; 2015, Maddie Chili, Zane Laughery and Davis Rumley</p>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
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

package org.apache.jsp.lst1q01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.text.SimpleDateFormat;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/Tratamentos/rodape.html");
    _jspx_dependants.add("/Tratamentos/Cabecalho.html");
    _jspx_dependants.add("/Tratamentos/Menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      			"true", true, 8192, true);
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
      out.write("\n");
      out.write("        <html><div id=\"footer\">  \n");
      out.write("            <p>Ranier William Mat:200811005 Josevania Duque Mat:200811037</p>\n");
      out.write("        </div></html>\n");
      out.write('\n');
      out.write("<html><h1 id=\"cabecalho\">Primeiro Trabalho de LP3</h1></html>\n");
      out.write('\n');
      out.write("<html>\n");
      out.write("\n");
      out.write("    <h3>Menu</h3>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("        <ul >\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q01/index.jsp\">Exercicio 1</A></li>\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q02/index.jsp\">Exercicio 2</A></li>\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q03/index.jsp\">Exercicio 3</A></li>\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q04/index.jsp\">Exercicio 4</A></li>\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q05/index.jsp\">Exercicio 5</A></li>\n");
      out.write("            <li><A HREF=\"/trb1lp3/lst1q06/index.jsp\">Exercicio 6</A></li>\n");
      out.write("        </ul>  \n");
      out.write("    </div>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');

//GregorianCalendar calendar = new GregorianCalendar();
//Date data = calendar.getTime();
//SimpleDateFormat formato = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss");
//formato.format(data);
//Colocar na variável da data formatada --> formato.format(data);
    Date data = new Date();
    data.getTime();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=stylesheet type=\"text/css\" href=\"/trb1lp3/Tratamentos/Estilo.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Exercicio 1</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <A HREF=\"index.jsp\">Atualizar</A>\n");
      out.write("        <h1>São Exatamente: ");
      out.print( data);
      out.write("</h1>\n");
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

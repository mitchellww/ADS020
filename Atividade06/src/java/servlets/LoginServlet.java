
//package controle;
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Sistema Acadêmico</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Efetuar Login</h1>");
            out.println("  <form action=\"/login\" method=\"post\">");
            out.println("  <div>");
            out.println("  <label>Matrícula:</label>");
            out.println("  <input type=\"text\" name=\"matricula\" ");
            out.println("  size=\"15\" value=\"\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label>Senha:</label>");
            out.println("<input type=\"password\" name=\"senha\" ");
            out.println("size=\"15\" value=\"\">");
            out.println("</div>");
            out.println("<input type=\"submit\" value=\"Entrar\"/>");
            out.println("</form>");
    out.println("</body>");
        out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String matricula = request.getParameter("matricula");
    }
 
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

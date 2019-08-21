package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OlaMundoServlet", urlPatterns = {"/OlaMundoServlet"})
public class OlaMundoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OlaMundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            /* out.println("<h1>Servlet OlaMundoServlet at " + request.getContextPath() + "</h1>"); */

            String nome = request.getParameter("nome");
            if (nome != null && nome.isEmpty() == false) {
                out.println("<h1>Olá " + nome + "!</h1>");
            } else {
                out.println("<h1>Olá Mundo!</h1>");
            }
            
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
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

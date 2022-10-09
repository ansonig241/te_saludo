
package com.emergente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PrincipalServlet", urlPatterns = {"/PrincipalServlet"})
public class PrincipalServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //TODO output your page here. You may use following sample code.
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Escribe tu Nombre</h1>");
            out.println("<form action='PrincipalServlet' method='post'>");
            out.println("<label>Nombre</label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<input type='submit' value='Porcesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
    }
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String nombre = request.getParameter("nombre");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Saludo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos recibidos</h1>");
            out.println("<p>Bienvenido <Strong>"+nombre+"</Strong> al curso de Java EE</p>");
            out.println("<a href='PrincipalServlet'>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
            }
        
    

}

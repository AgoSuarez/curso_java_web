package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Rectangulo;

@WebServlet("/servletController")
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //1. Procesamos Parámetro
        String accion = request.getParameter("accion");
        
        //2. Creamos JavaBeans
        Rectangulo rectRequest = new Rectangulo(1,2);
        Rectangulo rectSesion = new Rectangulo(3,4);
        Rectangulo rectAplicacion = new Rectangulo(5,6);
        
        //3. Agregamos el javabean a algún alcance
        //Revisamos la acción
        if ("agregarVariables".equals(accion)){
            //Request
            request.setAttribute("rectanguloRequest", rectRequest);
            //Sesion
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", rectSesion);
            //Aplicacion
            ServletContext aplication = this.getServletContext();
            aplication.setAttribute("rectanguloAplicacion", rectAplicacion);
            
            //Mensaje Request
            request.setAttribute("mensaje", "Las variables han sido agregadas");
        }else if ("listarVariables".equals(accion)){
            //4. Rediccionamos JSP que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
            request.setAttribute("mensaje", "Acción no válida");            
        }
        request.getRequestDispatcher("index.jsp").forward(request,response);
        //De esta manera no podemos compartir informacion con el JSP  a través de Request y Response
         //response.sendRedirect("index.jsp");

    }
    
}

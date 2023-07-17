package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCabeceros")
public class ServletCabeceros extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //Metodo: GET
            out.print("Metodo: "+ request.getMethod());
            out.print("<br>");
            //URI Solicitada: /cabeceros-1.0/ServletCabeceros
            out.print("UR Solicitada: "+  request.getRequestURI());
            out.print("<br>");
            //Todos los cabeceros disponibles
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                    String  c = cabeceros.nextElement().toString();
                    out.print("Cabeceros disponibles: "+  c + " " + request.getHeader(c));
                    out.print("<br>");
            }

            
        }
        
        
        
    }
}

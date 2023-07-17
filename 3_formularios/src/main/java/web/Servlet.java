
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out= response.getWriter();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String[] tecnologias= request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String[] musica = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");
        out.print(usuario);
        out.print(password);
        out.print("Tecnologías**");        
        for(String t: tecnologias){
            out.print(t);
        }        
        out.print(ocupacion);
        out.print("Música**");        
        for(String m: musica){
            out.print(m);
        }
        out.print(comentario);
    }
    
    
    
}

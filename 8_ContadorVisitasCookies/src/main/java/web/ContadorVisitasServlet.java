
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //variable contador
        int contador = 0;
        //Buscamos cookie contador visitas
        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie c: cookies){
                if (c.getName().equals("contador"))
                    contador = Integer.parseInt(c.getValue());
            }
        }
        //Incrementar contador
        contador++;
        Cookie c=new Cookie("contador", String.valueOf(contador));
        
        //Cookie solo se almacenará por una hora - 3600seg
        c.setMaxAge(3600);
        response.addCookie(c);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("Visita del cliente número: " + contador);
        }
    }
    
}

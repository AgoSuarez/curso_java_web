
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Enviamos info al navegador indicando que vamos a refrescar la información cada segundo
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        //Generamos la fecha con el formato requerido
        Date fecha = new Date();
        SimpleDateFormat formateador= new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        String horaConFormato = formateador.format(fecha);
        try (PrintWriter out = response.getWriter()) {
            out.print(horaConFormato);
        }
       
        
        
    }
}

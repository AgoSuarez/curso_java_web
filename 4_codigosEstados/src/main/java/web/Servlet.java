package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet        
{
    @Override
    protected void doPost(HttpServletRequest  request, HttpServletResponse response) throws IOException{
        String usuarioOk = "Juan";
        String passwordOk="1234";
        
        String usuario = request.getParameter("usuario");        
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if (usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("DATOS CORRECTOS");
        }else{
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Las credenciales son incorrectas" );
        }
    }
}

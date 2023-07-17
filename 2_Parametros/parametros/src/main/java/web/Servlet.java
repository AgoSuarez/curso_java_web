package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet")
public class Servlet extends HttpServlet{
    
    @Override 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //read parameters from form
        String user = request.getParameter("user");
        String pwd = request.getParameter("password");
        System.out.println("usuario: " + user);
        System.out.println("Password: " + pwd);
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El usuario es "+user);
        out.print("<br>");
        out.print("La password es "+pwd);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}

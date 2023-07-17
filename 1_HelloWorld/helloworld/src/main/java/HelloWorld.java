import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/HolaWorld"})
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
/*        System.out.println("Entrando en servlets");
        response.setContentType("text/html;charset=utF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola desde el servlet");*/
        response.sendRedirect("hola.jsp");
    }
}

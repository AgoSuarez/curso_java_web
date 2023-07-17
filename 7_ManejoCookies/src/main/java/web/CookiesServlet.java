package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Suponemos visita por primera vez
        boolean nuevoUsuario = true;
        PrintWriter out = response.getWriter();
        //Obtenemos cookies
        Cookie[] cookies = request.getCookies();
        //Buscamos si ya existe una cookie creada visitanteRecurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //Ya existe - No es la primera vez
                    nuevoUsuario = false;
                    break;
                }
            }
        }
        String msg =null;
        //Si nuevo usuario añadimos cookie
        if (nuevoUsuario) {
            Cookie visitante = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitante);
            msg = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            msg = "Gracias por volver a visitarnos";
        }
        response.setContentType("text/html;charset=UTF-8");
        out.print(msg);
    }
}

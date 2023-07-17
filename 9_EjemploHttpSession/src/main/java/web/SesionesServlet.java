/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        String titulo=null;
        //Pedir atributo contador visitas a la sesión
        Integer contadorVisitas = (Integer) sesion.getAttribute("contador");
        if (contadorVisitas == null){
            contadorVisitas=1;
            titulo="Bienvenido por primera vez";
        }else{
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }
        sesion.setAttribute("contador", contadorVisitas);
        try (PrintWriter out = response.getWriter()) {
            out.print("Visitas " + contadorVisitas + " " + titulo);
            out.print("<br> Id Sesión: " + sesion.getId());
            
        }
        
    }
    
}

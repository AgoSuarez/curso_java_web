/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        //procesamos el nuevo artículo
        String articuloNuevo = request.getParameter("articulo");
        //Recuperamos el httpSession
        HttpSession sesion = request.getSession();
        //Recuperamos lista de articulos si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        if (articulos == null){
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")){
            //Como se maneja referencia a objetos al agregar a la lista se añade también a la sesion
            articulos.add(articuloNuevo);
        }
        try ( //imprimimos la lista de articulos
                PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de articulos</h1><br>");
            for (String a: articulos){
                out.print(a + "<br>");
            }
            out.print("<a href='/CarritoCompra'>Regresar</a>");
        }
    }
    
}

package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Descarga archivo excel
        //poi.apache.org -> Libreria para uso mas profesional
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls"); 
       
        //No guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        //La info generada expire y siempre se genere info nueva
        response.setDateHeader("Expires", -1);
        
        //desplegamos información al cliente - Escribimos el excel
        try ( PrintWriter out = response.getWriter()) {
            out.println("\tValores"); //Celda B1
            out.println("\t1");//Celda B2
            out.println("\t2");//Celda B3
            out.println("Total\t=SUMA(b2:b3)");  //Celda B4
        } //Celda B1
    
    }
    
}

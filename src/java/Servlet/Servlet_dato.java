/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Operaciones.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Reformador
 */
public class Servlet_dato extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int id=Integer.parseInt(request.getParameter("id"));
            
            if(id==1){                
                int edad=Integer.parseInt(request.getParameter("edad"));
                String sexo=request.getParameter("sexo");
                Operaciones op=new Operaciones(edad,sexo);
                out.println("</br><center>");
                out.println("<h1><font-family='helvetica','arial'>Una persona de sexo "+sexo+" de "+edad+" "
                        + "años, tiene que cancelar: $"+op.seg()+"</font></h1></center></br></hr>");
                out.println("<a href='Vistas/ejercicio1.jsp'>Atras</a>");
            }
            else if (id==2){
                int v1=Integer.parseInt(request.getParameter("v1"));
                Operaciones op=new Operaciones(v1);
                int x=op.aleatorio();
                out.println("</br><center>");
                out.println("<h1><font-family='helvetica','arial'>El nuevo valor de tu compra es:"
                        + " "+x+"</font></h1></center></br></hr>");
                out.println("<a href='Vistas/ejercicio2.jsp'>Atras</a>");
            }
            else if (id==3){
                int num1=Integer.parseInt(request.getParameter("num1"));
                int num2=Integer.parseInt(request.getParameter("num2"));
                Operaciones op=new Operaciones(num1, num2);
                out.println("</br><center>");
                out.println("<h1><font-family='helvetica','arial'>Los numeros "+num1+" y"
                        + " "+num2+" "+op.amigo()+"</font></h1></br></hr>");
                out.println("<a href='Vistas/ejercicio3.jsp'>Atras</a></center>");
            }
        }
        finally {            
            out.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

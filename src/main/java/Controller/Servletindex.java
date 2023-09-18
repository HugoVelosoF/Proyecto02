/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class Servletindex extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        
            //Cargamos los valores previamente obtenidos (CAPITAL - INTERES - TIEMPO)
            int capital = Integer.parseInt(request.getParameter("capital"));
            
            //Dentro de la misma obtencion del campo interes realizamos el calculo del porcentaje anual
            double interes = Integer.parseInt(request.getParameter("interes")) / 100.0;
            int tiempo = Integer.parseInt(request.getParameter("tiempo"));
       
            //Realizamos la operacion correspondiente del interes
            double resultado = capital * interes * tiempo;
            
            out.println("<head>");
            out.println("<title>Calculadora de interes simple</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //Imprimos todos los resultados ingresados
            out.println("Los datos ingresados fueron: " + "<br>");
            out.println("Capital inicial:" + capital + "<br>");
            out.println("Tasa de interes anual (%):" + interes + "<br>");
            out.println("Tiempo (años):" + tiempo + "<br>");
            
            //Indicamos cual fue el resultado que nos dio el ejercicio
            out.println("El calculo da como resultado: " + "<br>" + resultado + "<br>");
            out.println("</body>");

        }
    }

    /*
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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

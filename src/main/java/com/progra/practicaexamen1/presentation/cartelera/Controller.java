/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.progra.practicaexamen1.presentation.cartelera;

import com.progra.practicaexamen1.logic.Tanda;
import com.progra.practicaexamen1.logic.Service;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author xarthy
 */
@WebServlet(name = "CarteleraController", urlPatterns =
{
    "/presentation/cartelera/show"
})
public class Controller extends HttpServlet {

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
        
        request.setAttribute("model", new Model());
        
        String viewUrl="";
        switch (request.getServletPath()) {
            case "/presentation/cartelera/show":
                viewUrl = this.show(request);
                break;
        }
        request.getRequestDispatcher(viewUrl).forward(request, response);
    }
    
    public String show(HttpServletRequest request) {
        return this.showAction(request);
    }
    
    public String showAction(HttpServletRequest request) {
        Model model = (Model) request.getAttribute("model");
        Service service = Service.instance();
//        HttpSession session = request.getSession(true);
        
        ArrayList<Tanda> cartelera;
        try {
            cartelera = service.peliculaFind("Mario");
        } catch (Exception ex) {
            cartelera = null;
        }
        try {
            model.setCartelera(service.peliculaFind("Mario"));
            return "/presentation/cartelera/View.jsp";
        } catch (Exception ex) {
            return "";
        }
    }

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

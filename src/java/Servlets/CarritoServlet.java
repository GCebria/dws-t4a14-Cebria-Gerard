/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import entidades.Producto;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})

public class CarritoServlet extends HttpServlet {

    ArrayList<Producto> ListaProductos = new ArrayList();
    
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
        request.getSession().setAttribute("lista", ListaProductos);
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(request, response);
    }
    
     @Override
    public void init() throws ServletException {
        
        Producto p1 = new Producto();
        p1.setId("id1");
        p1.setNombre("Prod1");
        p1.setPrecio(10);

        Producto p2 = new Producto();
        p2.setId("id2");
        p2.setNombre("Prod2");
        p2.setPrecio(20);

        Producto p3 = new Producto();
        p3.setId("id3");
        p3.setNombre("Prod3");
        p3.setPrecio(30);

        Producto p4 = new Producto();
        p4.setId("id4");
        p4.setNombre("Prod4");
        p4.setPrecio(40);

        Producto p5 = new Producto();
        p5.setId("id5");
        p5.setNombre("Prod5");
        p5.setPrecio(50);

        Producto p6 = new Producto();
        p6.setId("id6");
        p6.setNombre("Prod6");
        p6.setPrecio(60);

        ListaProductos.add(p1);
        ListaProductos.add(p2);
        ListaProductos.add(p3);
        ListaProductos.add(p4);
        ListaProductos.add(p5);
        ListaProductos.add(p6);
        /*ListaProductos.add(new Producto ("id1", "Prod1", 10));
    ListaProductos.add(new Producto ("id2", "Prod2", 20));
    ListaProductos.add(new Producto ("id3", "Prod3", 30));
    ListaProductos.add(new Producto ("id4", "Prod4", 40));
    ListaProductos.add(new Producto ("id5", "Prod5", 50));
    ListaProductos.add(new Producto ("id6", "Prod6", 60));*/

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

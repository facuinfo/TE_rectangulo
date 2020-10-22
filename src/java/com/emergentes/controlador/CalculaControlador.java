/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controlador;

import com.emergentes.modelo.Rectangulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author facu_
 */
@WebServlet(name = "CalculaControlador", urlPatterns = {"/CalculaControlador"})
public class CalculaControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int base = Integer.parseInt(request.getParameter("base"));
        int altura = Integer.parseInt(request.getParameter("altura"));
        Rectangulo obj=new Rectangulo();
        obj.setBase(base);
        obj.setAltura(altura);
        request.setAttribute("miobj", obj);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.usuario;
import java.io.IOException;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.Optional;

@WebServlet("/ListServlet")

    public class ListServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {

        }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
    HttpSession session = request.getSession();
    ArrayList<usuario> ListaU = (ArrayList<usuario>) session.getAttribute("myUsers");
    
        if (ListaU == null) {
          ListaU = new ArrayList<>();
            }

        request.setAttribute("listaProyectos", ListaU);
                if (ListaU.isEmpty()) {
            
            }

             request.getRequestDispatcher("list.jsp").forward(request, response);
    

}
   } 
    




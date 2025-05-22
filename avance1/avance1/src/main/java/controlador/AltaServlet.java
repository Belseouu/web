
package controlador;

import modelo.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author qtaxe
 */
public class AltaServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
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

    // Validación de parámetros
    String titulo = request.getParameter("txttitulo");
    String descripcion = request.getParameter("txtdes");
    String finicio = request.getParameter("textFini");
    String ffin = request.getParameter("txtFfin");
    String presupuesto = request.getParameter("txtpre");
    String investigador = request.getParameter("txtInv");

    if (titulo == null || titulo.trim().isEmpty() ||
        descripcion == null || descripcion.trim().isEmpty() ||
        finicio == null || finicio.trim().isEmpty() ||
        ffin == null || ffin.trim().isEmpty() ||
        presupuesto == null || presupuesto.trim().isEmpty() ||
        investigador == null || investigador.trim().isEmpty()) {
        
        
    }

 
        usuario u = new usuario(titulo, descripcion, finicio, ffin, presupuesto, investigador);

        HttpSession session = request.getSession();
        ArrayList<usuario> ListaU = (ArrayList<usuario>) session.getAttribute("myUsers");

        if (ListaU == null) {
            ListaU = new ArrayList<>();
        }

        ListaU.add(u);
        session.setAttribute("myUsers", ListaU);

        request.getRequestDispatcher("buscar.jsp").forward(request, response);

    } 
}

 

    
    
    
    
 


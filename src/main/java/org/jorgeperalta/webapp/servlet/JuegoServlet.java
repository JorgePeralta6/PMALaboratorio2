package org.jorgeperalta.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.jorgeperalta.webapp.model.Juego;
import org.jorgeperalta.webapp.service.JuegoService;

@WebServlet("/juego-servlet")
@MultipartConfig
public class JuegoServlet extends HttpServlet {

    private JuegoService juegoService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.juegoService = new JuegoService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Juego> juegos = juegoService.listarJuegos();
        req.setAttribute("juegos", juegos);
        req.getRequestDispatcher("./lista-juegos/lista-juegos.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getPathInfo();
        if (path == null || path.equals("/")) {
            agregarJuego(req, resp);
        } else {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST);

        }
    }

    public void agregarJuego(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombreJuego");
        String plataforma = req.getParameter("plataformaJuego");
        double precio = Double.parseDouble(req.getParameter("precio"));

        juegoService.agregarJuego(new Juego(nombre, plataforma, precio));

        resp.sendRedirect(req.getContextPath() + "/");
    }

}

package mx.edu.utez.mascota.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.mascota.model.Persona;

import java.io.IOException;

@WebServlet(name = "PersonaServlet", value = "/persona")
public class PersonaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //codigo que pasa cuando me hacen GET
        Persona p1 = new Persona();
        p1.setNombre("Derick Axel");
        p1.setApellido("Lagunes");
        p1.setEdad(30);
        p1.setSexo("Hombre");
        p1.setMatricula("d18ce078");
        p1.setFoto("assets/img/perfil.jpg");

        req.setAttribute("persona", p1);
        req.getRequestDispatcher("persona.jsp").forward(req, resp);
    }
}

package mx.edu.utez.mascota.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.edu.utez.mascota.model.Persona;
import mx.edu.utez.mascota.utils.RegistroPersona;

import java.io.IOException;

@WebServlet(name = "RegistrarPersonaServlet", value = "/registrarPersona")
public class RegistrarPersonaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Persona p1 = new Persona();

        String nombre = req.getParameter("nombre");
        String edad = req.getParameter("edadC");
        int edad_int = Integer.parseInt(edad);

        p1.setNombre(nombre);
        p1.setEdad(edad_int);

        String data = "nombre: " + p1.getNombre() + ", edad: " + p1.getEdad();

        RegistroPersona.escribirNuevaLinea(
                req.getServletContext().getRealPath("/")+"/BD.txt",
                data
        );

        String mensaje = "Exito! Se ha registrado a la persona en la BD!";
        req.getSession().setAttribute("mensaje", mensaje);
        resp.sendRedirect("index.jsp");

    }
}

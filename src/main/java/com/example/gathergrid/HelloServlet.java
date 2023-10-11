package com.example.gathergrid;

import com.example.gathergrid.dao.UserDao;
import com.example.gathergrid.domain.User;
import jakarta.persistence.Persistence;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "HelloServlet" ,value = "/hello")   //annotation
public class HelloServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;
        requestDispatcher=req.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String motDePasse = req.getParameter("mot_de_passe");
        String email = req.getParameter("email");

        User utilisateur = new User(nom, prenom, motDePasse, email);

        // Créer une instance de votre classe DAO
        UserDao userDao = new UserDao(Persistence.createEntityManagerFactory("default"));
        userDao.save(utilisateur);

        resp.sendRedirect("/confirmation.jsp");
    }
}

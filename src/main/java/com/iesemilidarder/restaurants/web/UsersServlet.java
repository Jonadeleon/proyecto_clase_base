package com.iesemilidarder.restaurants.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UsersServlet")
public class UsersServlet extends HttpServlet {
    //no le llega el parametro USUARIO que le pedimos
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        ReadUsers readUser = new ReadUsers();
        try {
            request.setAttribute("user", readUser.readUsers(user));
            request.getRequestDispatcher("users.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

package com.contact;

import bdd.sql.MessageCrud;
import bdd.beans.Message;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Contact", value = "/contact")
public class Contact extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Render the Contact Form Template
        this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contact.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get Request Body Values
        String mail = request.getParameter("mail");
        String message = request.getParameter("message");

        // If one of the values is null
        if (mail == "" || message == "") {
            // TODO - Regex Check for the email

            // set an error attribute for the template
            request.setAttribute("errorMessage", "Un des champs n'est pas renseigné");
            // Render the template
            this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contact.jsp").forward(request, response);

        } else if (message.length() > 1000) {
            // TODO - Check for message with blank characters
            // set an error attribute for the template
            request.setAttribute("errorMessage", "Le message contient plus de 1000 caractères.");
            // Render the template
            this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contact.jsp").forward(request, response);

        } else {
            // Create new Message
            Message cMessage = new Message(mail, message);
            // Initialise the Crud of the Message table
            MessageCrud tableCMessage = new MessageCrud();

            try {
                // Try to add the message to the database
                tableCMessage.add(cMessage);
            } catch (SQLException | ClassNotFoundException e) {
                // TODO - Render the 500 error code template
                // TODO - Log the error and notify admins
                e.printStackTrace();
            }

            // Render Confirmation Template
            this.getServletContext().getRequestDispatcher("/WEB-INF/contact/contactConfirm.jsp").forward(request, response);
        }

    }
}

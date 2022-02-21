package bdd.sql;

import bdd.beans.Message;
import bdd.interfaces.MessageCrudInterface.MessageCrudInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageCrud implements MessageCrudInterface {
    private Connection connexion;

    @Override
    public void add(Message message) throws SQLException, ClassNotFoundException {
        // Connexion à la base de donnees
        this.connexion = loadDatabase();

        // Create a prepared statement
        PreparedStatement preparedStatement = connexion.prepareStatement(
                "INSERT INTO contactmessage(mail, message) VALUES(?, ?);");
        // Bind Parameters to the statement
        preparedStatement.setString(1, message.getMail());
        preparedStatement.setString(2, message.getMessage());

        // Execute the statement
        preparedStatement.executeUpdate();
    }

    private Connection loadDatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exoEric", "root", "");
        System.out.println("Connected to Database.");
        return connection;

    }

}

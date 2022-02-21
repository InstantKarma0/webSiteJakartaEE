package bdd.sql;

import bdd.beans.Article;
import bdd.interfaces.ArticleCrudInterface.ArticleCrudInterface;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class ArticleCrud implements ArticleCrudInterface {
    private Connection connexion;

    @Override
    public List<Article> getAll() throws SQLException, ClassNotFoundException {
        // Connect to the database
        this.connexion = loadDatabase();

        // Create the Query
        PreparedStatement preparedStatement = connexion.prepareStatement(
                "SELECT * FROM article ORDER BY RAND ();");
        // Execute the Query and fetch the results
        ResultSet rs = preparedStatement.executeQuery();

        // Create a new List of Articles
        List<Article> listArticle = new ArrayList<Article>();

        // Initialise the articles and its data
        Article article;
        int id;
        String imgUrl;
        String title;
        String description;
        float price;


        // While there is a row of results
        while (rs.next()) {

            // get the datas of the current object
            id = rs.getInt("id");
            imgUrl = rs.getString("imgUrl");
            title = rs.getString("title");
            description = rs.getString("description");
            price = rs.getFloat("price");

            // Create the object with its data
            article = new Article(id, imgUrl, title, description, price);

            // Add the article to the list
            listArticle.add(article);
        }

        // Return the list
        return listArticle;
    }

    @Override
    public Article getOne(int articleId) throws SQLException, ClassNotFoundException {
        this.connexion = loadDatabase();
        ResultSet rs = null;
        PreparedStatement preparedStatement = connexion.prepareStatement(
                "SELECT * FROM article WHERE id = ?");
        preparedStatement.setInt(1, articleId);
        rs = preparedStatement.executeQuery();

        int id = rs.getInt("id");
        String imgUrl = rs.getString("imgUrl");
        String title = rs.getString("title");
        String description = rs.getString("description");
        float price = rs.getFloat("price");

        return new Article(id, imgUrl, title, description, price);
    }

    @Override
    public void add(Article article) throws SQLException, ClassNotFoundException {
        this.connexion = loadDatabase();

        PreparedStatement preparedStatement = connexion.prepareStatement(
                "INSERT INTO article(imgUrl, title, description, price) VALUES(?, ?, ?, ?);");
        preparedStatement.setString(1, article.getImgUrl());
        preparedStatement.setString(2, article.getTitle());
        preparedStatement.setString(3, article.getDescription());
        preparedStatement.setFloat(4, article.getPrice());

        preparedStatement.executeUpdate();
    }

    @Override
    public void update(Article article) throws SQLException, ClassNotFoundException {
        this.connexion = loadDatabase();

        PreparedStatement preparedStatement = connexion.prepareStatement(
                "UPDATE article SET imgUrl = ?, title = ?, description = ?, price = ? WHERE id = ?;");
        preparedStatement.setString(1, article.getImgUrl());
        preparedStatement.setString(2, article.getTitle());
        preparedStatement.setString(3, article.getDescription());
        preparedStatement.setFloat(4, article.getPrice());
        preparedStatement.setInt(5, article.getId());

        preparedStatement.executeUpdate();
    }

    @Override
    public void delete(int articleId) throws SQLException, ClassNotFoundException {
        this.connexion = loadDatabase();
        PreparedStatement preparedStatement = connexion.prepareStatement(
                "DELETE FROM article WHERE id = ?;");
        preparedStatement.setInt(1, articleId);

        preparedStatement.execute();
    }

    private Connection loadDatabase() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/exoEric", "root", "");
        System.out.println("Connected to Database.");
        return connection;

    }
}

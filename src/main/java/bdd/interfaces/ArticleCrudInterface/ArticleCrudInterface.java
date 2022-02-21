package bdd.interfaces.ArticleCrudInterface;

import bdd.beans.Article;

import java.sql.SQLException;
import java.util.List;

public interface ArticleCrudInterface {

    public void add(Article article) throws SQLException, ClassNotFoundException;

    public List<Article> getAll() throws SQLException, ClassNotFoundException;

    public Article getOne(int id) throws SQLException, ClassNotFoundException;

    void update(Article article) throws SQLException, ClassNotFoundException;

    public void delete(int id) throws SQLException, ClassNotFoundException;
}

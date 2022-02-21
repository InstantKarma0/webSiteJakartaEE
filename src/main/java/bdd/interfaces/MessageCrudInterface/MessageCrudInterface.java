package bdd.interfaces.MessageCrudInterface;

import bdd.beans.Message;

import java.sql.SQLException;

public interface MessageCrudInterface {

    public void add(Message message) throws SQLException, ClassNotFoundException;

    //public List<Message> getAll();

    //public void update(Message message);

    //public void delete(Message message);
}

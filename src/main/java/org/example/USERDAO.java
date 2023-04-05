package org.example;

import java.sql.SQLException;

public interface USERDAO {
    User getByID(int ID) throws SQLException;

    void createUser(User user);

    void changeInfo(int ID);

    void delete(int ID);

}

package database;

import model.User;

/**
 * Created by Illya Havrulyk on 2/22/2018.
 */

public interface Database {

    void writeUser(User user);

    User findUser(String login);

}

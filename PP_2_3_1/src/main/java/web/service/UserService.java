package web.service;

import web.models.User;

import java.util.List;

public interface UserService {


    List<User> index ();

    User showUser (int id);

    void save (User user);

    void update (User userUpdated);

    void deleteUser (int id);
}

package de.unibayreuth.se.taskboard.business.ports;

import de.unibayreuth.se.taskboard.business.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    //TODO: Add user service interface that the controller uses to interact with the business layer.
    List<User> getAllUsers();
    User getUserById(UUID id);
    User createUser(User user);

    //TODO: Implement the user service interface in the business layer, using the existing user persistence service.
}

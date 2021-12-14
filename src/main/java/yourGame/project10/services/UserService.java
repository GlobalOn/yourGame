package yourGame.project10.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yourGame.project10.model.User;
import yourGame.project10.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User findUser(Integer userId) {
        Optional<User> employeesOptional = userRepository.findById(userId);
        return employeesOptional.orElse(null);
    }

    @Transactional
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public void deleteUserById(Integer userId) {
        User user = findUser(userId);
        if (user != null) {
            userRepository.delete(user);
        }
    }

    @Transactional
    public void updateUserById(Integer useId, String name, String email, String password, Integer role, String game) {
        User user = findUser(useId);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            user.setRole(role);
            user.setGame(game);
        }
    }
}

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
    public User findUser(Long userId) {
        Optional<User> employeesOptional = userRepository.findById(userId);
        if (employeesOptional.isPresent()) {
            return employeesOptional.get();
        }
        return null;
    }

    @Transactional
    public User addUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Transactional
    public void deleteUserById(Long userId) {
        User user = findUser(userId);
        if (user != null) {
            userRepository.delete(user);
        }
    }

    @Transactional
    public void updateUserById(Long useId, String name, String password, String role, String game) {
        User user = findUser(useId);
        if (user != null) {
            user.setName(name);
            user.setName(password);
            user.setName(role);
            user.setName(game);
        }
    }
}

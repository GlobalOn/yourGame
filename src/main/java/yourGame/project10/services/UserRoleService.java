package yourGame.project10.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yourGame.project10.model.UserRoles;
import yourGame.project10.repositories.UserRoleRepository;

import java.util.Optional;

@Service
public class UserRoleService {

    UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleService(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Transactional
    public UserRoles findUserRole(Integer userId) {
        Optional<UserRoles> employeesOptional = userRoleRepository.findById(userId);
        return employeesOptional.orElse(null);
    }

    @Transactional
    public UserRoles addUserRole(UserRoles userRoles) {
        return userRoleRepository.save(userRoles);
    }

    @Transactional
    public void deleteUserById(Integer userRoleId) {
        UserRoles userRoles = findUserRole(userRoleId);
        if (userRoles != null) {
            userRoleRepository.delete(userRoles);
        }
    }
}

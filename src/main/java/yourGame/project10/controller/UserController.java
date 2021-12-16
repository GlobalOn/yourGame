package yourGame.project10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yourGame.project10.model.User;
import yourGame.project10.model.UserRoles;
import yourGame.project10.services.UserRoleService;
import yourGame.project10.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;
    UserRoleService userRoleService;

    public UserController() {
    }

    @Autowired
    public UserController(UserRoleService userRoleService, UserService userService) {
        this.userRoleService = userRoleService;
        this.userService = userService;
    }

    @GetMapping
    public User addNewUser(@RequestParam String name,
                           @RequestParam String password,
                           @RequestParam String email,
                           @RequestParam Integer role,
                           @RequestParam String game) {
        userRoleService.addUserRole(new UserRoles("Regular user"));
        userRoleService.addUserRole(new UserRoles("Admin"));

        User user = new User(name, password, email, role, game);
        return userService.addUser(user);
    }
}

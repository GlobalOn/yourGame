package yourGame.project10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yourGame.project10.model.User;
import yourGame.project10.services.UserService;

@RestController
@RequestMapping("/")
public class UserController {

    UserService userService;

    public UserController() {
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User addNewUser(@RequestParam String name,
                           @RequestParam String password,
                           @RequestParam String email,
                           @RequestParam Integer role,
                           @RequestParam String game) {
        return userService.addUser(new User(name, password, email, role, game));
    }
}

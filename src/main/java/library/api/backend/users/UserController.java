package library.api.backend.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    UserService myUserService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> getAllUsers(){return myUserService.getAllUsers();}

    @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
    public User getUsersById(@PathVariable int id){return myUserService.getUser(id);}

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){ myUserService.createUser(user);}

    @RequestMapping(value="/users", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){ myUserService.updateUser(user);}

    @RequestMapping(value="/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){ myUserService.deleteUser(id);}

}

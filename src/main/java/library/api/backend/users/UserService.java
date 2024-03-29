package library.api.backend.users;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository myUserRepository;

    public List<User> getAllUsers(){
        List<User> myUsers = new ArrayList<>();
        myUserRepository.findAll().forEach(myUsers::add);
        return myUsers;
    }

    public User getUser(int id){
        return myUserRepository.findOne(id);
    }

    public void createUser(User user){
        myUserRepository.save(user);
    }

    public void updateUser(User user){
        myUserRepository.save(user);
    }

    public void deleteUser(int id){
          myUserRepository.delete(id);
    }


}

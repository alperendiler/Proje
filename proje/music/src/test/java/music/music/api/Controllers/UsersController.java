package music.music.api.Controllers;

import music.music.Business.Abstracts.UserService;
import music.music.Entities.Concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UsersController {


    @Autowired
    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }
}

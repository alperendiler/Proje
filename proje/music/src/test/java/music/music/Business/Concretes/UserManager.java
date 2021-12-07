package music.music.Business.Concretes;

import music.music.Business.Abstracts.UserService;
import music.music.Entities.Concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserManager userManager;

    @Autowired
    public UserManager(UserManager userManager) {
        this.userManager = userManager;
    }


    @Override
    public List<User> getAll() {
        return null;
    }
}

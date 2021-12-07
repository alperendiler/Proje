package music.music.Business.Abstracts;

import music.music.Entities.Concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}

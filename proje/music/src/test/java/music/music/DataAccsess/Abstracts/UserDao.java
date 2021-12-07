package music.music.DataAccsess.Abstracts;

import music.music.Entities.Concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}

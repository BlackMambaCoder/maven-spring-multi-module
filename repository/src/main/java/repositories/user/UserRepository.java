package repositories.user;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LEO
 * @since 28.11.17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName (String name);
}

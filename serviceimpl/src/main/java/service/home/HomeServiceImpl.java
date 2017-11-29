package service.home;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.user.UserRepository;

/**
 * @author LEO
 * @since 28.11.17.
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public String getHome() {
        User user = new User();
        user.setName("Leo");

        if (userRepository.findByName(user.getName()) == null) {
            userRepository.save(user);
        }

        return userRepository.findByName(user.getName()).getId().toString();
    }
}

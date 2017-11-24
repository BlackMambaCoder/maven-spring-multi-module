package home;

import org.springframework.stereotype.Service;

/**
 * @author LEO
 * @since 23.11.17.
 */
@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public String getHome() {
        return "Hello world";
    }
}

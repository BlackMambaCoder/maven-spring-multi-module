package controller;

import home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LEO
 * @since 23.11.17.
 */
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String getHome() {
        return homeService.getHome();
    }
}

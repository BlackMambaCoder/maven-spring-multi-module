package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import service.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LEO
 * @since 23.11.17.
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired private HomeService homeService;

    @GetMapping("getHome")
    public String getHome() {
        return homeService.getHome();
    }
}

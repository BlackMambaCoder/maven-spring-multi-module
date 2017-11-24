package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LEO
 * @since 23.11.17.
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome() {
        return "Hello world";
    }
}

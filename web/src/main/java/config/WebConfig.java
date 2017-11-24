package config;

import controller.ControllerPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LEO
 * @since 23.11.17.
 */
@Configuration
@ComponentScan(basePackageClasses = { ControllerPackage.class })
public class WebConfig {
}

package config;

import home.HomeServicePackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LEO
 * @since 23.11.17.
 */
@Configuration
@ComponentScan(basePackageClasses = { HomeServicePackage.class })
public class ServiceImplConfig {
}

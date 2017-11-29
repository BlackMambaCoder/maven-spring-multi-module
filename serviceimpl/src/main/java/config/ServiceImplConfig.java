package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.ServiceImplPackage;

/**
 * @author LEO
 * @since 23.11.17.
 */
@Configuration
@ComponentScan(basePackageClasses = { ServiceImplPackage.class })
public class ServiceImplConfig {
}

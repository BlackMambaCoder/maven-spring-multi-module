package config;

import entities.EntityPackage;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author LEO
 * @since 29.11.17.
 */
@Configuration
@EntityScan(basePackageClasses = EntityPackage.class)
public class DomainConfig {
}

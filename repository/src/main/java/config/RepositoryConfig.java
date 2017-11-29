package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.RepositoryPackage;

/**
 * @author LEO
 * @since 28.11.17.
 */
@Configuration
@EnableJpaRepositories(basePackageClasses = RepositoryPackage.class)
public class RepositoryConfig {
}

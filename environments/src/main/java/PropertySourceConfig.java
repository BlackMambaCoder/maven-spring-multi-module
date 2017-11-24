import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author LEO
 * @since 24.11.17.
 */
@Configuration
public class PropertySourceConfig {

    private static final Resource[] LOCAL_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("application.properties"),
            new ClassPathResource("application-local.properties"),
    };

    private static final Resource[] STAGE_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("application.properties"),
            new ClassPathResource("application-stage.properties"),
    };

    private static final Resource[] PRODUCTION_PROPERTIES = new ClassPathResource[]{
            new ClassPathResource("application.properties"),
            new ClassPathResource("application-production.properties"),
    };

    @Profile("local")
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurerLOCAL() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        pspc.setLocations(LOCAL_PROPERTIES);
        return pspc;
    }

    @Profile("stage")
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurerSTAGE() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        pspc.setLocations(STAGE_PROPERTIES);
        return pspc;
    }

    @Profile("prod")
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurerPRODUCTION() {
        PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        pspc.setLocations(PRODUCTION_PROPERTIES);
        return pspc;
    }

}

package kubic;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Main {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .main(Main.class)
                .sources(Main.class)
                .run(args);
    }

}
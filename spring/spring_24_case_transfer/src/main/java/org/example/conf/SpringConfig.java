package org.example.conf;

import org.example.MyBatisConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
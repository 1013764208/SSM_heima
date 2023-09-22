package com.heima.confg;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.heima")
@EnableAspectJAutoProxy
public class SpringConfig {

}

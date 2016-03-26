package com.kuznetsov.veeva;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class VeevaApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(VeevaApplication.class);
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VeevaApplication.class);
    }
//    @Autowired
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("test").password("test").roles("USER");
//    }
    public static void main(String[] args) {
        logger.debug("Started!");
        SpringApplication.run(VeevaApplication.class, args);
    }

}

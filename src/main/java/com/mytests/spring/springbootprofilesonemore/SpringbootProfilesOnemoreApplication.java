package com.mytests.spring.springbootprofilesonemore;

import com.mytests.spring.springbootprofilesonemore.common.UseBeans;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringbootProfilesOnemoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProfilesOnemoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("--- beans is context:");
            Arrays.sort(ctx.getBeanDefinitionNames());
            for (String beanName : ctx.getBeanDefinitionNames()) {
                System.out.println(beanName);
            };
            ctx.getBean(UseBeans.class).displayBeans();
        };
    }
}

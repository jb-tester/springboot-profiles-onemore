package com.mytests.spring.boo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//
@Configuration("_booConfig")
@ComponentScan
@Profile("boo")
public class BooConfig {
}

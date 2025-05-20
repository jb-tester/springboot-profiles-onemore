package com.mytests.spring.bar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//
@Configuration("_barConfig")
@ComponentScan
@Profile("bar")
public class BarConfig {
}

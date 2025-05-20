package com.mytests.spring.foo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//
@Configuration("_fooConfig")
@ComponentScan
@Profile("foo")
public class FooConfig {


}

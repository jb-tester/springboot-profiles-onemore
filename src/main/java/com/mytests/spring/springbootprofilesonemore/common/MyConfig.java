package com.mytests.spring.springbootprofilesonemore.common;

import com.mytests.spring.foo.FooConfig;
import com.mytests.spring.bar.BarConfig;
import com.mytests.spring.boo.BooConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

//
@Configuration
@ComponentScan
@Import(value = {FooConfig.class, BarConfig.class, BooConfig.class})
public class MyConfig {

    // multiple beans with the same name but different profiles - ok
    @Bean("_bean1_") @Profile("foo")
    public Bean1 bean1_foo() {

        return new Bean1("from foo");
    }
    @Bean("_bean1_") @Profile("bar")
    public Bean1 bean1_bar() {

        return new Bean1("from bar");
    }
    @Bean("_bean1_") @Profile("boo")
    public Bean1 bean1_boo() {

        return new Bean1("from boo");
    }

    // multiple beans with the same name but opposite conditions - structure is incorrect
    @Bean(name = "_bean3_")
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "foo")
    public Bean3 mybean31() {
        return new Bean3("foo bean3");
    }
    @Bean(name = "_bean3_")
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "bar")
    public Bean3 mybean32() {
        return new Bean3("bar bean3");
    }
    @Bean(name = "_bean3_")
    @ConditionalOnProperty(name = "spring.profiles.active", havingValue = "boo")
    public Bean3 mybean33() {
        return new Bean3("boo bean3");
    }

    // multiple beans with different names and different profiles - ok
    @Bean @Profile("foo")
    public Bean2 bean2_foo() {

        return new Bean2("from foo");
    }
    @Bean @Profile("bar")
    public Bean2 bean2_bar() {

        return new Bean2("from bar");
    }
    @Bean @Profile("boo")
    public Bean2 bean2_boo() {

        return new Bean2("from boo");
    }

}

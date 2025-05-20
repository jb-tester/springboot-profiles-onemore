package com.mytests.spring.springbootprofilesonemore.common;

import com.mytests.spring.foo.FooConfig;
import com.mytests.spring.bar.BarConfig;
import com.mytests.spring.boo.BooConfig;
import org.springframework.context.annotation.*;

//
@Configuration
@ComponentScan
@Import(value = {FooConfig.class, BarConfig.class, BooConfig.class})
public class MyConfig {

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

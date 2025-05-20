package com.mytests.spring.springbootprofilesonemore.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component("_fooCompo")
@Profile("foo")
public class FooCompo implements MyService1{

    @Value("_fooCompo")
    String id;

    public String getId() {
        return id;
    }
}

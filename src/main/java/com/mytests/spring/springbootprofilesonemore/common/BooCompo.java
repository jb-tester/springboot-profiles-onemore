package com.mytests.spring.springbootprofilesonemore.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component("_booCompo")
@Profile("boo")
public class BooCompo implements MyService1 {

    @Value("_booCompo")
    String id;

    @Override
    public String getId() {
        return id;
    }
}

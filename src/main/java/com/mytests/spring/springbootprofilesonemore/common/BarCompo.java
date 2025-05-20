package com.mytests.spring.springbootprofilesonemore.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component("_barCompo")
@Profile(value = {"bar"})
public class BarCompo implements MyService1{

    @Value("_barCompo")
    String id;

    public String getId() {
        return id;
    }
}

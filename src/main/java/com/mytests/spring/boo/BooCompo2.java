package com.mytests.spring.boo;

import com.mytests.spring.springbootprofilesonemore.common.MyService2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// scanned by profile-specific configuration so is also profile-specific
@Component("_booCompo2")
public class BooCompo2 implements MyService2 {

    @Value("_booCompo2")
    String id;

    public String getId() {
        return id;
    }
}

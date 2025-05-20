package com.mytests.spring.foo;

import com.mytests.spring.springbootprofilesonemore.common.MyService2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// scanned by profile-specific configuration so is also profile-specific
@Component("_fooCompo2")
public class FooCompo2 implements MyService2 {

    @Value("_fooCompo2")
    String id;

    @Override
    public String getId() {
        return id;
    }
}

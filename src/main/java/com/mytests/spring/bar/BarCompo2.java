package com.mytests.spring.bar;

import com.mytests.spring.springbootprofilesonemore.common.MyService2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// scanned by profile-specific configuration so is also profile-specific
@Component("_barCompo2")
public class BarCompo2 implements MyService2 {

    @Value("_barCompo2")
    String id;

    public String getId() {
        return id;
    }
}

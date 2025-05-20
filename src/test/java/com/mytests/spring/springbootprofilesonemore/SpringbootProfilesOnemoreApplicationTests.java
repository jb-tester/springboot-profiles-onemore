package com.mytests.spring.springbootprofilesonemore;

import com.mytests.spring.springbootprofilesonemore.common.UseBeans;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootProfilesOnemoreApplicationTests {

    @Autowired
    private UseBeans useBeans;

    @Test
    void contextLoads() {
        useBeans.displayBeans();
    }

}

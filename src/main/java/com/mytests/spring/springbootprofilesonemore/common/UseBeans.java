package com.mytests.spring.springbootprofilesonemore.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UseBeans implements UseBeanService {


    private final MyService1 myService1;
    private final MyService2 myService2;
    private final Bean1 bean1;
    private final Bean2 bean2;
    private final QualifiedService qualifiedService;
    private final Bean3 bean3;

    public UseBeans(MyService1 myService1, // @Profile-annotated component in the current package
                    MyService2 myService2, // component in the extra package, scanned by @Profile-annotated config
                    Bean1 bean1, // @Profile-annotated @Bean methods, all beans of the same name and type
                    Bean2 bean2, // @Profile-annotated @Bean methods, all beans of the same type but with different names
                    @Qualifier("service32") QualifiedService qualifiedService, // not profile-specific implementation, found by qualifier
                    Bean3 bean3) {
        this.myService1 = myService1;
        this.myService2 = myService2;
        this.bean1 = bean1;
        this.bean2 = bean2;
        this.bean3 = bean3;
        this.qualifiedService = qualifiedService;
    }

    public void displayBeans() {
        System.out.println("==========");
        System.out.println("bean of MyService1 type: "+ myService1.getId());
        System.out.println("bean of MyService2 type: "+ myService2.getId());
        System.out.println("bean of Bean1 type: " + bean1.toString());
        System.out.println("bean of Bean2 type: " + bean2.toString());
        System.out.println("bean of Bean3 type: " + bean3.toString());
        System.out.println("==========");

        
    }

    ;
}

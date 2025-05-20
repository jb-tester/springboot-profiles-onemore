package com.mytests.spring.springbootprofilesonemore.common;

@org.springframework.stereotype.Service("service31")
class FirstQualifiedImpl implements QualifiedService {

    @Override
    public String getId() {
        return "MyService3_1";
    }
}


    
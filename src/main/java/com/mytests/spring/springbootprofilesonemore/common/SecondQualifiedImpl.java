package com.mytests.spring.springbootprofilesonemore.common;

@org.springframework.stereotype.Service("service32")
class SecondQualifiedImpl implements QualifiedService {

    @Override
    public String getId() {
        return "MyService3_2";
    }
}
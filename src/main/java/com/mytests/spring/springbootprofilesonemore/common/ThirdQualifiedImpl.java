package com.mytests.spring.springbootprofilesonemore.common;

@org.springframework.stereotype.Service("service33")
class ThirdQualifiedImpl implements QualifiedService {

    @Override
    public String getId() {
        return "MyService3_3";
    }
}
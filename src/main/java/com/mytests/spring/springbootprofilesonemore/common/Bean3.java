package com.mytests.spring.springbootprofilesonemore.common;


public class Bean3 {
    private final String str;

    public Bean3(String s) {
        this.str = s;
    }

    @Override
    public String toString() {
        return "Bean3{" +
               "str='" + str + '\'' +
               '}';
    }
}

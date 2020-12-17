package com.company;

public class lines {
    public static int getLineCount(String string){
        return string.split("[\n|\r]").length;
    }

}

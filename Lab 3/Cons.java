package com.company;

public class Cons {

    public static int getLineVandB(String string) {

        int vCount = 0;
        int cCount = 0;
        {
            int i=0;
            while(i<string.length()){
                char ch=string.charAt(i);
                if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'
                        ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' ){
                    vCount++;
                }
                else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' )){
                    cCount++;
                }
                i++;
            }
            return cCount;
        }
    }

}

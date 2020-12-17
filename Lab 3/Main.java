package com.company;

import static com.company.edit.wordcount;
import static com.company.lines.getLineCount;
import static com.company.Vow.getLineVandC;
import static com.company.Cons.getLineVandB;
import static com.company.Longest.LongestWordLength;
import static com.company.Letters.letters;

public class Main {

    public static void main(String[] args) {
        String string ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec maximus diam eu eros feugiat cursus. Ut non nisl ut sem tempus posuere. Sed consequat a ligula quis accumsan. Phasellus egestas libero ante, nec volutpat ligula efficitur eu. Mauris vulputate velit vel felis gravida mattis. Vestibulum a consequat enim. Mauris non libero eu ex ornare facilisis ac vel velit. Etiam id massa nec mauris sagittis fermentum quis ut ex. Vestibulum venenatis neque nisl, vel gravida nunc maximus id. Vivamus commodo malesuada ipsum, a blandit tellus eleifend sed. Phasellus euismod eget risus in laoreet. Mauris ultrices lectus quis mauris rhoncus, eget elementum justo malesuada.\n" +
                "Integer et elit quis lectus hendrerit vehicula a ac leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam arcu odio, scelerisque id efficitur et, ultrices ut turpis. In ac bibendum risus. Suspendisse potenti. Donec bibendum et augue sit amet lobortis. Nulla at magna metus. Proin nunc urna, varius at vulputate vitae, convallis sit amet nisi. Aliquam sed dapibus nunc, vitae accumsan sem. Donec quis nibh id dui faucibus blandit at a velit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque bibendum elit quis nunc pretium, imperdiet pretium lectus laoreet. Vivamus eros neque, vestibulum non sagittis eu, facilisis at turpis. Donec egestas tellus id eros tristique fermentum. Maecenas semper, nulla non rutrum porttitor, tortor tellus cursus urna, id ultricies dui mauris sed ex. Ut porta sem sit amet tincidunt pellentesque. ";


        System.out.println(wordcount(string) + " words.");
        int count = getLineCount(string);
        System.out.println("Line count: "+ count);
        int vCount = getLineVandC(string);
        System.out.println("Number of Vowels: " + vCount);
        int cCount = getLineVandB(string);
        System.out.println("Number of Consonants: " + cCount);
        System.out.println("Length of the longest word: " + LongestWordLength(string));
        int lett = letters(string);
        System.out.println("Letters: "+ lett);
        }

}


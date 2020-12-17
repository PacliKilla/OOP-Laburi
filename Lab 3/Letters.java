package com.company;

public class Letters
{
    public static int letters(String String)
    {
        int lett = 0;
        for (int i = 0; i < String.length(); i++)
        {
            if (Character.isLetter(String.charAt(i)))
                lett++;
        }
        return lett;

    }
}


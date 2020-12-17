package com.company;

public class Longest {
    public static int LongestWordLength(String string)
    {
        int n = string.length();
        int res = 0, curr_len = 0;
        for (int i = 0; i < n; i++)
        {
            if (string.charAt(i) != ' ')
                curr_len++;
            else
            {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }
        }
        return Math.max(res, curr_len);
    }

}


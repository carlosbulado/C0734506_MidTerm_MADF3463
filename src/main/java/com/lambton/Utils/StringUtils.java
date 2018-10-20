package com.lambton.Utils;

import java.util.ArrayList;

public class StringUtils
{
    public static char[] transformsIntoCharArray(String s)
    {
        ArrayList<Character> chAL = new ArrayList<>();
        char[] arrRet = new char[0];
        int pos = 0;
        while(true)
        {
            try
            {
                char ch = s.charAt(pos);
                chAL.add(ch);
                pos++;
            }
            catch (Exception ex)
            {
                break;
            }
        }
        arrRet = new char[pos];
        int i = 0;
        for (Character ch : chAL)
        {
            arrRet[i] = ch;
            i++;
        }
        return arrRet;
    }
}

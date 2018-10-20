package com.lambton.Utils;

import com.lambton.Exceptions.BinaryInputException;
import com.lambton.Exceptions.InitialsException;

import java.util.HashMap;

public class LambtonStringTools
{
    public static String reverse(String s)
    {
        String reversedString = "";
        char[] arrChar = StringUtils.transformsIntoCharArray(s);
        for (char ch : arrChar) reversedString = ch + reversedString;
        return reversedString;
    }

    public static int binaryToDecimal(String s) throws Exception
    {
        char[] arrChar = StringUtils.transformsIntoCharArray(reverse(s));
        int total = 0;
        int times = 1;
        for (char ch : arrChar)
        {
            if (ch != '1' && ch != '0') throw new BinaryInputException("-1");
            total += (((int)ch) - 48) * times;
            times *= 2;
        }
        return total;
    }

    public static String initials(String s) throws Exception
    {
        String[] arrStr = s.split("\\s+");
        String retur = "";
        int loop = 0;
        for (String name : arrStr)
        {
            loop++;
            if (loop == 4) throw new InitialsException("" + loop);
            if (loop < 3) retur +=  name.toUpperCase().charAt(0) + ". ";
            else retur += name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        }
        if (loop < 3) throw new InitialsException("" + loop);
        return retur;
    }

    public static String mostFrequent(String s)
    {
        HashMap<Character, Integer> counting = new HashMap<>();
        char[] arrChar = StringUtils.transformsIntoCharArray(s);
        for (char ch : arrChar)
        {
            if(counting.containsKey(ch))
            {
                Integer num = counting.get(ch);
                num++;
                counting.put(ch, num);
            }
            else
            {
                counting.put(ch, 1);
            }
        }

        int greater = 0;
        String mostFrequent = "";
        for (Character i : counting.keySet())
        {
            if(counting.get(i) > greater)
            {
                greater = counting.get(i);
                mostFrequent = "" + i;
            }
        }
        return mostFrequent;
    }

    public static String replaceSubString(String s1, String s2, String s3)
    {
        String[] arrStr = s1.split("\\s+");
        String retur = "";
        for (String toChange : arrStr)
        {
            toChange = toChange.toLowerCase();
            if (toChange.equals(s2.toLowerCase())) retur += s3.toLowerCase() + " ";
            else retur += toChange + " ";
        }
        return retur;
    }
}

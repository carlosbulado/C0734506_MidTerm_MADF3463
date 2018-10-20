package com.lambton;

import com.lambton.Exceptions.BinaryInputException;
import com.lambton.Exceptions.InitialsException;
import com.lambton.Utils.LambtonStringTools;

import java.util.Scanner;

public class Exam
{
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Type param for reverse func:");
        String first_func_param = reader.nextLine();
        String first_func = LambtonStringTools.reverse(first_func_param);
        System.out.println("LambtonStringTools.reverse(\"" + first_func_param + "\")");
        System.out.println(first_func);

        try
        {
            System.out.println("Type param for binaryToDecimal func:");
            String second_func_param = reader.nextLine();
            int second_func = LambtonStringTools.binaryToDecimal(second_func_param);
            System.out.println("LambtonStringTools.binaryToDecimal(\"" + second_func_param + "\")");
            System.out.println(second_func);
        }
        catch (BinaryInputException ex)
        {
            System.out.println("LambtonStringTools.binaryToDecimal returns " + ex.getMessage() + " because the param was not a binary number!");
        }
        catch (Exception ex)
        {
            System.out.println("LambtonStringTools.binaryToDecimal returns unknown exception!");
        }

        try
        {
            System.out.println("Type param for initials func:");
            String third_func_param = reader.nextLine();
            String third_func = LambtonStringTools.initials(third_func_param);
            System.out.println("LambtonStringTools.initials(\"" + third_func_param + "\")");
            System.out.println(third_func);
        }
        catch (InitialsException ex)
        {
            System.out.println("LambtonStringTools.initials returns null because string had " + ex.getMessage() + " name(s) but it should have 3!");
        }
        catch (Exception ex)
        {
            System.out.println("LambtonStringTools.initials returns unknown exception!");
        }

        System.out.println("Type param for mostFrequent func:");
        String fourth_func_param = reader.nextLine();
        String fourth_func = LambtonStringTools.mostFrequent(fourth_func_param);
        System.out.println("LambtonStringTools.mostFrequent(\"" + fourth_func_param + "\")");
        System.out.println(fourth_func);

        System.out.println("Type first param for replaceSubString func:");
        String fiveth_func_param_1 = reader.nextLine();
        System.out.println("Type second param for replaceSubString func:");
        String fiveth_func_param_2 = reader.nextLine();
        System.out.println("Type third param for replaceSubString func:");
        String fiveth_func_param_3 = reader.nextLine();
        String fiveth_func = LambtonStringTools.replaceSubString(fiveth_func_param_1, fiveth_func_param_2, fiveth_func_param_3);
        System.out.println("LambtonStringTools.replaceSubString(\"" + fiveth_func_param_1 + ", " + fiveth_func_param_2 + ", " + fiveth_func_param_3 + "\")");
        System.out.println(fiveth_func);
    }
}

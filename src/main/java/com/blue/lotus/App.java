package com.blue.lotus;

import com.blue.lotus.date.DateUtils;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        String datestr = "2016-01- 12:22:02";
        Date d1 = DateUtils.stringToDate(datestr);
        System.out.print(d1);
        System.out.print("test git add ");
        System.out.print("add branches b1, update b1 at idea..");
        System.out.print("................");

        System.out.print("test git add, update b1 at github");

        System.out.print("resolve confict merge");


    }
}

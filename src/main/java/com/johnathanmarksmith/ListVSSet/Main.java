package com.johnathanmarksmith.ListVSSet;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.apache.log4j.Logger.getLogger;

/**
 * Date:   5/24/13 / 7:55 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 *
 * Comments:
 *
 *    This is a example on how to use Spring's Java Configuration (JavaConfig) style with Maven,
 *    JUnit, Log4J, Hibernate and HyperSQL (hsqldb).
 *
 */
public class Main
{

    private static final Logger LOGGER = getLogger(Main.class);

    public static void main(String[] args)
    {
        LOGGER.debug("Starting!!!!");


            System.out.println("\nList example .....");
            List<String> list = new ArrayList<String>();
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("1");
            list.add("2");
            list.add("5");

            for (String temp : list){
                System.out.println(temp);
            }
            System.out.println("\n");

            System.out.println("Set example .....");
            Set<String> set = new HashSet<String>();
            set.add("1");
            set.add("2");
            set.add("3");
            set.add("4");
            set.add("1");
            set.add("2");
            set.add("5");

            for (String temp : set){
                System.out.println(temp);
            }
           System.out.println("\n");


        LOGGER.debug("This is the end!!!!");
    }
}

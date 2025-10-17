package com.rajavigneswaran.Collections;

import java.util.*;
import java.io.*;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();

        props.setProperty("username", "raja");
        props.setProperty("password", "pass");
        props.setProperty("email", "raj@gmail.com");

        System.out.println("properties data: " + props);

        System.out.println("username: " + props.getProperty("username"));

        FileOutputStream out = new FileOutputStream("data.properties");
        props.store(out, "user Info");
        out.close();

        Properties readProps = new Properties();

        FileInputStream in = new FileInputStream("data.properties");
        readProps.load(in);
        in.close();

        System.out.println("loaded from file:");
        for (String key : readProps.stringPropertyNames()) {
            System.out.println(key + " = " + readProps.getProperty(key));
        }
    }
}

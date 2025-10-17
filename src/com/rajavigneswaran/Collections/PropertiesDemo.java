package com.rajavigneswaran.Collections;

import java.util.*;
import java.io.*;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();


        props.setProperty("username", "Raj");
        props.setProperty("password", "12345");
        props.setProperty("url", "jdbc:mysql://localhost:3306/test");

        System.out.println("Username: " + props.getProperty("username"));
        System.out.println("All Keys: " + props.stringPropertyNames());

        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos, "Database Configuration");
        fos.close();

        Properties loadProps = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProps.load(fis);
        fis.close();

        System.out.println("\nLoaded from file:");
        loadProps.list(System.out);
    }
}

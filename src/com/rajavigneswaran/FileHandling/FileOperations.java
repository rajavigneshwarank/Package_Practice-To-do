package com.rajavigneswaran.FileHandling;
import java.io.*;
import java.util.*;

public class FileOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("demo.txt");

        while (true) {

            System.out.println("FILE HANDLING APPLICATION");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read from File");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {
                    case 1:

                        if (file.createNewFile())
                            System.out.println("File created: " + file.getName());
                        else
                            System.out.println("File already exists.");
                        break;

                    case 2:
                        System.out.print("Enter text to write: ");
                        String data = sc.nextLine();

                        FileWriter fw = new FileWriter(file, true);

                        fw.write(data + "\n");

                        fw.close();

                        System.out.println("Data written successfully.");
                        break;

                    case 3:
                        if (!file.exists()) {
                            System.out.println("file not found!");
                            break;
                        }
                        Scanner fr = new Scanner(file);
                        System.out.println("\n--- File Content ---");

                        while (fr.hasNextLine()) {
                            System.out.println(fr.nextLine());
                        }
                        fr.close();
                        System.out.println("--------------------");
                        break;

                    case 4:
                        if (file.delete())
                            System.out.println("File deleted");
                        else
                            System.out.println("File not found ");
                        break;

                    case 5:
                        System.out.println("Exit application");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            }
            catch (IOException e)
            {

                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

package com.rajavigneswaran.FileHandling;
import java.io.*;
import java.util.*;

public class FileOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("demo.txt");

        try {
            System.out.println("1. Create file");
            System.out.println("2. Write to file");
            System.out.println("3. Read from file");
            System.out.println("4. Delete file");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();
            sc.nextLine();

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
                    FileWriter fw = new FileWriter(file);

                    fw.write(data);
                    fw.close();

                    System.out.println("Data written successfully.");
                    break;

                case 3:
                    Scanner fr = new Scanner(file);
                    System.out.println("File content:");

                    while (fr.hasNextLine()) {
                        System.out.println(fr.nextLine());
                    }

                    fr.close();
                    break;

                case 4:
                    if (file.delete())
                        System.out.println("File deleted");

                    else
                        System.out.println("File not found");

                    break;

                default:
                    System.out.println("Invalid option.");

            }

        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

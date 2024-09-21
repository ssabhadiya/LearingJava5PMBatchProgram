package Sat10Aug;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        FileHandling fileHandling = new FileHandling();
        //  fileHandling.createFile();
        // fileHandling.WriteFile();
        //   fileHandling.readFile();
        fileHandling.deleteFile();
    }

    void WriteFile() throws IOException {
        FileWriter fileWriter = new FileWriter("Texttest.txt");
        fileWriter.write("My name is sandip sabhadiya\n");
        fileWriter.write("My name is sandip sabhadiya1\n");
        fileWriter.write("My name is sandip sabhadiya2");
        fileWriter.close();
    }

    void createFile() throws IOException {
        File createfile = new File("Texttest.txt");
        if (createfile.createNewFile()) {
            System.out.println("New file is created");

        } else {
            System.out.println("File already exist");
        }
    }

    void readFile() throws FileNotFoundException {
        File file = new File("Texttest.txt");
        Scanner scannerread = new Scanner(file);
        while (scannerread.hasNextLine()) {
            String data = scannerread.nextLine();
            System.out.println(data);
        }
        scannerread.close();
    }

    void deleteFile() throws IOException {
        File file = new File("Texttest.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");

        }
    }
}

package org.example.HW5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = readFileContentsOrNull("D:\\GB учёба\\ООП Java\\OOP_Homework\\src\\main\\java\\org\\example\\HW5\\Contacts.csv");
        String[] lines = str.split(System.lineSeparator());
        String[] words = lines[0].split(", ");
        System.out.println(Arrays.toString(words));
//        System.out.println(str);
        System.out.println(Arrays.toString(lines));

        Contact contact = new Contact(words[0], words[1], words[2]);
        System.out.println(contact);

    }

    private static String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            return null;
        }
    }
}

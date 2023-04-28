package org.example.HW5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Controller {
    private PhoneBook pb;
    private View view;

    public Controller(PhoneBook pb, View view) {
        this.pb = pb;
        this.view = view;
    }

    public void importPhoneBook(String path) {

    }

    private String readFileContentsOrNull(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            return null;
        }
    }
}

package com.linkedlist;

import com.linkedlist.input.ReadFile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please write file path: ");
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        ReadFile file = new ReadFile();
        file.getText(filePath);
    }
}

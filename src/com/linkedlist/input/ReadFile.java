package com.linkedlist.input;

import com.linkedlist.functionalities.LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void getText(String filePath) {

        BufferedReader reader;
        LinkedList linkedList = new LinkedList();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();

            while (line != null) {

                if(line.charAt(0) == 'i'){
                    linkedList.insertNode((Integer.parseInt(line.substring(2))));
                }
                if(line.charAt(0) == 'd'){
                    linkedList.deleteNode((Integer.parseInt(line.substring(2))));
                }
                line = reader.readLine();
            }
            reader.close();
            linkedList.printNode();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

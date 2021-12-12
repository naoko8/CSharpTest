package com.linkedlist.functionalities;

public class LinkedList {

    Node head;

    public void insertNode(int data) {
        Node new_node = new Node(data);

        if(head == null) {
            head = new Node(data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public void deleteNode(int value) {

        Node temp = head;
        Node previous = null;

        if(temp == null) {
             return;
        }

        if(temp.next != null && temp.data == value) {
            head = temp.next;
            return;
        }

        try {
            while(temp.data != value) {
                previous = temp;
                temp = temp.next;
            }
        } catch (NullPointerException nullPointerException) {
            System.out.println("Node value <<" + value + ">> does not exist. Please input the right node value to delete");
            return;
        }

        if(previous == null) {
            System.out.println("Node value does not exist");
            return;
        }

        previous.next = temp.next;

    }

    public void printNode() {
        Node node = head;
        int i = 1;
        while(node != null) {
            System.out.println("Node" + i + ": " + node.data);
            node = node.next;
            i++;
        }
    }
}
